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
                                <md-input v-model="user.id"></md-input>
                                <span class="md-error" v-if="isRequired">The first name is required</span>
                            </md-field>
                        </div>
                        <div class="md-layout-item md-small-size-100">
                            <md-field>
                                <label>PassWord</label>
                                <md-input v-model="user.pw"></md-input>
                                <span class="md-error">The first name is required</span>
                            </md-field>
                        </div>
                        <div class="md-layout-item md-small-size-100">
                            <md-field>
                                <label>Name</label>
                                <md-input v-model="user.name"></md-input>
                                <span class="md-error">The first name is required</span>
                            </md-field>
                        </div>
                        <div class="md-layout-item md-small-size-100">
                            <md-field>
                                <label>Phone</label>
                                <md-input v-model="user.phone"></md-input>
                                <span class="md-error">The first name is required</span>
                            </md-field>
                        </div>
                        <div class="md-layout-item md-small-size-100">
                            <md-field>
                                <label>Email</label>
                                <md-input v-model="user.email"></md-input>
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
                id: '',
                pw: '',
                name: '',
                phone: '',
                email: ''
            },
            isRequired: false
        }
    },    
    methods:  {
        onClickSave: function(){
            if(this.user.id==""){
                this.isRequired = true;
                console.log(this.isRequired);
                return false;
            }
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