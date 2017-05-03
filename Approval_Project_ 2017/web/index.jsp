<%-- 
    Document   : login
    Created on : Feb 24, 2017, 2:05:03 PM
    Author     : supanattechasothon
--%>

<style>
    body{
        background-color:#FAFAFA;
    }
</style>

<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://apis.google.com/js/platform.js" async defer></script>

<meta name="google-signin-scope" content="profile email">
<meta name="google-signin-client_id"
     content="1008859256581-pigg650v05nm9fpgh0r1pa9fhdb1c578.apps.googleusercontent.com">

<script>
      //google callback. This function will redirect to our login servlet
      function onSignIn(googleUser) {
         var profile = googleUser.getBasicProfile();
         console.log('ID: ' + profile.getId());
         console.log('Name: ' + profile.getName());
         console.log('Image URL: ' + profile.getImageUrl());
         console.log('Email: ' + profile.getEmail());
         console.log('id_token: ' + googleUser.getAuthResponse().id_token);

         //do not post all above info to the server because that is not secure.
         //just send the id_token

         var redirectUrl = 'login';

         //using jquery to post data dynamically
         var form = $('<form action="' + redirectUrl + '" method="post">' +
                          '<input type="text" name="id_token" value="' +
                           googleUser.getAuthResponse().id_token + '" />' +
                                                                '</form>');
         $('body').append(form);
         form.submit();
      }

   </script>


<div class="container_new">
    <div class="set_box_height_auto col_pixel_6 set_box_margin_center_page  set_margin_container_default_60">
        <h2 class="set_text_align_center set_text_color_1 set_font_weight_bold">Login</h2>
        <form action="${pageContext.servletContext.contextPath}/Login/Authorization" method="POST" data-parsley-validate="true">
            <div class="form_group_row">
                <label></label>
                <input type="text" name="email" id="form_login_email" placeholder="Email" class="form_control_textField set_text_align_center" data-parsley-required="true">
            </div>
            <div class="form_group_row">
                
                <input type="text" name="password" id="form_login_password" placeholder="Password" class="form_control_textField set_text_align_center" data-parsley-required="true">
            </div>
            <div class="form_group_row set_text_align_center">
                <button type="submit" class="set_btn_confirm_md_backgroundWhite">Login</button>
                <!--<a href="${pageContext.request.contextPath}/Coordinator" class="set_btn_confirm_md_backgroundWhite" type="submit">Login</a>-->
            </div>
        </form>
        
        <div class="g-signin2" data-onsuccess="onSignIn"></div>

    </div>
</div>
