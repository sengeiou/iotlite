<template>
  <b-container fluid>
  <b-row>
    <b-col>
      <h1>Product# {{form.name}}</h1>
      <p>{{form.description}}</p>
    </b-col>
  </b-row>
  <b-row>
    <b-col>
      <b-nav tabs>
        <b-nav-item to="base"  active-class="active" >Base</b-nav-item>
        <b-nav-item to="model"  active-class="active" ><b-icon icon="code"  /> Model</b-nav-item>
        <!-- <b-nav-item to="version"  >Version</b-nav-item> -->
      </b-nav>
      <router-view  class="content" :form=form></router-view>
    </b-col>
  </b-row>
</b-container>
</template>

<script>
import {product} from "../../api/product"
export default {
  name:"ProductDetail",
  mounted(){
    this.getInfo()
  },
  methods:{
    getInfo(){
      var _this=this;
      console.log(this.$route.params.id)
      product.info({
        id:this.form.id
      }).then(res=>{
        _this.form=res.data
      })
    }
  },
  data(){
    return {
      form:{
        id:0||this.$route.params.id,
      },
      list:[
        {
          id:"",
          name:"燃气",
          description:"CQ2010"
        },
        {
          id:"",
          name:"烟感",
          description:"CQ2010"
        },
        
      ],
    }
  }
}
</script>

<style scoped>

</style>