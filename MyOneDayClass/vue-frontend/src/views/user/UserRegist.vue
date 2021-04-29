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
            isRequired: false
        }
    },    
    methods:  {
        onClickSave: function(){
            if(this.user.userId=="" || this.user.userPw=="" || this.user.userName==""
              || this.user.userPhone=="" || this.user.userEmail==""){
                this.isRequired = true;
                return false;
            }

            this.fn_save();
        },
        fn_save: function(){
            let _param = this.user;

            this.$axios.put("/user/regist", _param).then(({data})=>{
                if(data){
                    console.log("통신함");
                }
            }).catch(e=>{
                console.log('error:', e)
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