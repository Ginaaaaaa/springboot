<template>
    <div>
        <md-dialog :md-active.sync="isShowLoginPopup"
                   @md-clicked-outside="onClickClose">
            <md-tabs>
                <md-tab md-label="Login" md-disabled>
                    <md-field>
                        <label>ID</label>
                        <md-input v-model="user.userId" />
                        <span class="md-helper-text" v-if="!isRequired.userId">ID를 입력해주세요.</span>
                    </md-field>
                    <md-field>
                        <label>PW</label>
                        <md-input v-model="user.userPw" type="password"/>
                        <span class="md-helper-text md-error" v-if="!isRequired.userPw">비밀번호를 입력해주세요.</span>
                    </md-field>
                </md-tab>
            </md-tabs>
            <md-dialog-actions>
                <md-button @click="onClickClose">CLOSE</md-button>
                <md-button class="md-primary" @click="onClickLogin">SIGN-IN</md-button>
            </md-dialog-actions>
        </md-dialog>
    </div>
</template>

<script>

export default {
    props: {
        propsParam: {type:Boolean, default:false}
    },
    watch: {
        propsParam: function(val){
            this.isShowLoginPopup = val;
        }
    },
    data (){
        return {
            isShowLoginPopup: false,
            user:{
                userId: '',
                userPw: ''
            },
            isRequired: {
                userId: true,
                userPw: true
            }
        }
    },
    methods: {
        checkRequired: function(){
            if(this.user.userId==""){
                this.isRequired.userId = false; return false;
            }else{
                this.isRequired.userId = true;
            }
            if(this.user.userPw==""){
                this.isRequired.userPw = false; return false;
            }else{
                this.isRequired.userPw = true;
            }
        },
        onClickLogin: function(){
            this.checkRequired();

            if(this.isRequired.userId && this.isRequired.userPw){
                this.fn_login();              
            }else{
                return false;
            }
        },
        fn_login: function(){ // formData? serializeobject? 로그인 기능할 차례
            let params = {
                userId : this.user.userId,
                userPw : this.user.userPw
            }
            
            this.$axios.put("/api/user/login", params).then(({data})=>{
                if(data){
                    console.log("로그인성공");
                    this.isShowLoginPopup = false;
                }
                else{
                    alert("ID 또는 비밀번호를 다시 확인해주세요");
                }
            });
        },
        onClickClose: function(){
            this.isShowLoginPopup = false;
            this.$emit('closeLoginPopup', this.isShowLoginPopup);
        }
    }
}
</script>

<style>
.modal,
.overlay {
    width: 100%;
    height: 100%;
    position: fixed;
    left: 0;
    top: 0;
    z-index: 10;
}
.overlay {
    opacity: 0.3;
    background-color: black;
}
.modal-card {
    position: relative;
    margin: auto;
    margin-top: 200px;
    padding-top: 50px;
    padding-left: 30px;
    padding-right: 30px;
    background-color: white;
    max-width: 350px;
    min-height: 300px;
    z-index: 11;
    opacity: 1;
}

.div-btn {
    position: absolute;
    bottom: 10px;
    right: 10px;
}
</style>