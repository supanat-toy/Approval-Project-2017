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

<div class="container_new">
    <div class="set_box_height_auto col_pixel_6 set_box_margin_center_page  set_margin_container_default_60">
        <h2 class="set_text_align_center set_text_color_1 set_font_weight_bold">Login</h2>
        <form  method="POST" > 
            <div class="form_group_row">
                <label></label>
                <input type="text" id="form_login_email" placeholder="Username" class="form_control_textField set_text_align_center" data-parsley-required="true">
            </div>
            <div class="form_group_row">
                
                <input type="text" id="form_login_password" placeholder="Password" class="form_control_textField set_text_align_center" data-parsley-required="true">
            </div>
            <div class="form_group_row set_text_align_center">
                <a href="/Student/Index" class="set_btn_confirm_md_backgroundWhite" type="submit">Login</a>
            </div>
        </form>

    </div>
</div>
