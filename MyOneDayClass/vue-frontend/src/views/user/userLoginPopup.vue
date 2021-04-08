<template>
    <div class="modal">
        <div class="overlay" @click="closeModal"></div> <!-- component와 같은 크기의 modal 배경. 즉, modal의 반투명 배경영역 -->
        <div class="modal-card"> <!-- modal 영역 -->
            <div class="div-input">
                <md-field class="has-danger">
                    <label>Your Id</label>
                    <md-input />
                </md-field>
                <md-field class="has-danger" style>
                    <label>Password</label>
                    <md-input />
                </md-field>
            </div>
            <div class="div-btn">
                <md-button @click="enterLogin">sign-up</md-button>
                <md-button @click="closeModal">close</md-button>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    data (){
        return {
        }
    },
    methods: {
        closeModal: function(){
            this.$emit('closeLoginPopup');
        },
        enterLogin: function(){
            console.log("click login");
        }
    },
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