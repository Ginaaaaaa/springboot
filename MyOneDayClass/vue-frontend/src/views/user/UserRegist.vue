<template>
    <div style="margin: 0 auto; max-width:500px;">
        <md-card>
            <md-card-content>
                <md-field>
                    <label>ID</label>
                    <md-input v-model="user.userId" />
                    <md-button :md-ripple="false" @click="onClickCheckId">중복검사</md-button>
                    <span class="md-helper-text" v-if="!isRequired.userId">ID를 입력해주세요.</span>
                    <span class="md-helper-text" v-if="!isCheckId">이미 사용 중인 ID 입니다.</span>
                </md-field>
                <md-field>
                    <label>PW</label>
                    <md-input v-model="user.userPw" type="password"/>
                    <span class="md-helper-text md-error" v-if="!isRequired.userPw">비밀번호를 입력해주세요.</span>
                </md-field>
                <md-field>
                    <label>Name</label>
                    <md-input v-model="user.userName" />
                    <span class="md-helper-text" v-if="!isRequired.userName">이름을 입력해주세요.</span>
                </md-field>
                <md-field>
                    <label>Phone</label>
                    <md-input v-model="user.userPhone" />
                    <span class="md-helper-text">'-'을 제외한 숫자만 입력해주세요.'</span>
                    <span class="md-helper-text" v-if="!isRequired.userPhone">전화번호를 입력해주세요.</span>
                </md-field>
                <md-field>
                    <label>Email</label>
                    <md-input v-model="user.userEmail" />
                    <span class="md-helper-text" v-if="!isRequired.userEmail">이메일을 입력해주세요.</span>
                </md-field>
            </md-card-content>
            <md-card-actions>
                <md-button @click="onClickCancel">CANCEL</md-button>
                <md-button class="md-primary md-raised" @click="onClickSave">SIGN-UP</md-button>
            </md-card-actions>
        </md-card>
    </div>
</template>

<script>
// import { MdField } from 'vue-material/dist/components';

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
            isCheckId: true,
            isRequired: {
                userId: true,
                userPw: true,
                userName: true,
                userPhone: true,
                userEmail: true
            },
        }
    },    
    methods:  {
        onClickCheckId: function(){
            if(this.user.userId==""){
                this.isRequired.userId = false; return false;
            }
            
            this.$axios.get("/api/user/checkRegistId?userId="+this.user.userId
            ).then(({data})=>{
                if(data){
                    this.isCheckId=true;
                }else{
                    this.isCheckId=false; return false;
                }
            }).catch(e=>{
                console.log('error:', e);
            });
        },
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
            if(this.user.userName==""){
                this.isRequired.userName = false; return false;
            }else{
                this.isRequired.userName = true;
            }
            if(this.user.userPhone==""){
                this.isRequired.userPhone = false; return false;
            }else{
                this.isRequired.userPhone = true;
            }
            if(this.user.userEmail==""){
                this.isRequired.userEmail = false; return false;
            } else{
                this.isRequired.userEmail = true;
            }  
        },
        onClickSave: function(){
            if(!this.isCheckId){
                alert("ID의 중복 여부룰 확인해주세요.");
            }else{
                // 입력값 확인
                this.checkRequired();
            }

            if(this.isRequired && this.isCheckId){
                this.fn_save();              
            }else{
                return false;
            }
        },
        fn_save: function(){
            let params = this.user;

            this.$axios.put("/api/user/regist", params).then(({data})=>{
                if(data){
                    alert("회원가입이 완료되었습니다.\n메인 화면으로 이동합니다.");
                    this.$router.push({name:'IndexHome'});
                }
            }).catch(e=>{
                console.log('error:', e);
            });
        },
        onClickCancel: function(){
            this.$router.push({name:'IndexHome'});
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