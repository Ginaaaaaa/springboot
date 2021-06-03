<template>
    <div>
        <form>
            <md-card class="md-layout-item md-size-40 md-small-size-100">
                <md-card-header>
                    <div class="md-title">Create Account</div>
                </md-card-header>
                <md-card-content>
                    <div class="md-layout md-gutter">
                        <!-- <div class="md-layout-item md-small-size-100">
                            <md-field :class="getValidationClass('firstName')">
                                <label for="first-name">First Name</label>
                                <md-input name="first-name" id="first-name" autocomplete="given-name" v-model="form.firstName" :disabled="sending" />
                                <span class="md-error" v-if="!$v.form.firstName.required">The first name is required</span>
                                <span class="md-error" v-else-if="!$v.form.firstName.minlength">Invalid first name</span>
                            </md-field>
                        </div> -->
                        <div class="md-layout-item md-small-size-100">
                            <md-field>
                                <label>ID</label>
                                <md-input v-model="user.userId"></md-input>
                                <md-button @click="onClickCheckId">중복검사</md-button>
                                <span class="md-error" v-if="isRequired">The first name is required</span>
                            </md-field>
                        </div>
                        <div class="md-layout-item md-small-size-100">
                            <md-field>
                                <label>PassWord</label>
                                <md-input v-model="user.userPw"></md-input>
                                <span class="md-error">The first name is required</span>
                            </md-field>
                        </div>
                        <div class="md-layout-item md-small-size-100">
                            <md-field>
                                <label>Name</label>
                                <md-input v-model="user.userName"></md-input>
                                <span class="md-error">The first name is required</span>
                            </md-field>
                        </div>
                        <div class="md-layout-item md-small-size-100">
                            <md-field>
                                <label>Phone</label>
                                <md-input v-model="user.userPhone"></md-input>
                                <span class="md-error">The first name is required</span>
                            </md-field>
                        </div>
                        <div class="md-layout-item md-small-size-100">
                            <md-field>
                                <label>Email</label>
                                <md-input v-model="user.userEmail"></md-input>
                                <span class="md-error">The first name is required</span>
                            </md-field>
                        </div>
                    </div>
                </md-card-content>
                <md-card-actions>
                    <md-button @click="onClickSave">Sign-Up</md-button>
                    <md-button @click="onClickCancel">Cancel</md-button>
                </md-card-actions>
            </md-card>
        </form>
    </div>
</template>

<script>

export default{
    data() {
        return {
            user:{
                userId: '',
                userPw: '',
                userName: '',
                userPhone: '',
                userEmail: ''
            },
            isCheckId: false,
            isRequired: false
        }
    },    
    methods:  {
        onClickCheckId: function(){
            if(this.user.userId==""){
                alert("ID를 입력해주세요.");
                return false;
            }
            
            // let _param = {'userId' : this.user.userId}; console.log("_param");console.log(_param);
            this.$axios.get("/user/checkRegistId?userId="+this.user.userId
            ).then(({data})=>{
                if(data){
                    alert("사용가능한 ID 입니다."); this.isCheckId=true;
                }else{
                    alert("이미 사용 중인 ID 입니다."); this.isCheckId=false;
                    return false;
                }
            }).catch(e=>{
                console.log('error:', e);
            });
        },
        checkRequired: function(){
            this.isRequired = true;

            if(this.user.userId==""){
                alert("ID를 입력해주세요.");
                this.isRequired = false; return false;
            }
            if(this.user.userPw==""){
                alert("비밀번호를 입력해주세요.");
                this.isRequired = false; return false;
            }
            if(this.user.userName==""){
                alert("이름을 입력해주세요.");
                this.isRequired = false; return false;
            }
            if(this.user.userPhone==""){
                alert("전화번호를 입력해주세요.");
                this.isRequired = false; return false;
            }
            if(this.user.userEmail==""){
                alert("이메일을 입력해주세요.");
                this.isRequired = false; return false;
            }   
        },
        onClickSave: function(){
            if(!this.isCheckId){
                alert("ID의 중복 여부룰 확인해주세요."); return false;
            }
            this.checkRequired();

            if(this.isRequired && this.isCheckId){
                this.fn_save();              
            }
        },
        fn_save: function(){
            const FormData = require('form-data');
            const form = new FormData();
            form.append("userId", this.user.userId);
            form.append("userPw", this.user.userPw);
            form.append("userName", this.user.userName);
            form.append("userPhone", this.user.userPhone);
            form.append("userEmail", this.user.userEmail);

            this.$axios.put("/user/regist", form, {
                header: {
                    'Content-Type': 'application/x-www-form-urlencoded'
                },
            }).then(({data})=>{
                if(data == "SUCCESS"){
                    alert("회원가입이 완료되었습니다.\n메인 화면으로 이동합니다.");
                    this.$router.push({name:'Main'});
                    // let isLogin = confirm("회원가입이 완료되었습니다.\n로그인하시겠습니까?");
                    // if(isLogin){
                    //     this.$emit('openLoginPopup');
                    // }else{
                    //     this.$router.push({name:'Main'});
                    // }
                }
            }).catch(e=>{
                console.log('error:', e);
            });
        },
        onClickCancel: function(){
            this.$router.push({name:'Main'});
        }  
    }
}
</script>

<style lang="scss" scoped>
  .md-progress-bar {
    position: absolute;
    top: 0;
    right: 0;
    left: 0;
  }
</style>