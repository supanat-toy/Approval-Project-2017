

<div class="set_background_screen_2 set_margin_container_default_10">
    <div class="box_layer_info_3">
        <div class="title">
            <div class="container_new">
                <span class="topic">Details</span>
            </div>
        </div>
        <div class="container_new">
            <div class="details">
                <div class="box_organinzer_event set_margin_container_default_10">
                    <ul id="navtabs_create_member" class="nav_tabs_box_organinzer_event nav nav-tabs">
                        <li class="active"><a data-toggle="tab" href="#Details_tab">Details</a></li>
                        <li><a data-toggle="tab" href="#Properties_tab">Properties</a></li>
                        <li><a data-toggle="tab" href="#Technical_tab">Technical</a></li>
                        <li><a data-toggle="tab" href="#SoundLight_tab">Sound & Light</a></li>
                        <li><a data-toggle="tab" href="#ArtsCulture_tab">Arts & Culture</a></li>
                        <li><a data-toggle="tab" href="#Security_tab">Security</a></li>
                        <li><a data-toggle="tab" href="#IT_tab">IT</a></li>
                    </ul>
                    <div class="tab_content tab-content">
                        <div id="Details_tab" class="tab-pane fade in active">
                            <div class="topic">
                                <i class="fa fa-file-text-o" aria-hidden="true"></i> Details
                            </div>
                            <div class="details">
                                <div class="col_percent_8 set_padding_right_15 set_padding_right_15">
                                    <form action="#" method="POST" data-parsley-validate="true">
                                        <div class="form_group_row">
                                            <label>Job/Activity name</label>
                                            <input name="event_name" class="form_control_textField" data-parsley-required="true">
                                        </div>
                                        <div class="form_group_row">
                                            <div class="col_percent_7 set_padding_right_15">
                                                <label>Job Function / Activities</label>
                                                <input name="event_type" class="form_control_textField" data-parsley-required="true">
                                            </div>
                                            <div class="col_percent_5">
                                                <label>Faculty / Department</label>
                                                <input name="event_department" class="form_control_textField" data-parsley-required="true">
                                            </div>
                                        </div>
                                        <div class="form_group_row">
                                            <label>Place</label>
                                            <div class="box_each_checkbox_radio">
                                                <input id="radio-require_form_1" name="place" class="radio-custom" value="huamak" type="radio" checked>
                                                <label for="radio-require_form_1" class="radio-custom-label"> Huamak</label>
                                            </div>
                                            <div class="box_each_checkbox_radio">
                                                <input id="radio-require_form_2" name="place" class="radio-custom" value="bangna" type="radio">
                                                <label for="radio-require_form_2" class="radio-custom-label"> Bangna</label>
                                            </div>
                                        </div>
                                        <div class="form_group_row">
                                            <label>Room/Facilities</label>
                                            <input name="event_name" class="form_control_textField">
                                        </div>
                                        <div class="form_group_row">
                                            <div class="col_percent_7 set_padding_right_15">
                                                <label>Preparation Date</label>
                                                <div class="input-group date" id="datepicker-disabled-past_startDate" data-date-format="dd/mm/yyyy" data-date-start-date="Date.default">
                                                    <input type="text" name="event_startDate" class="form_control_textField" placeholder="" data-parsley-required="true" />
                                                    <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                                </div>
                                            </div>
                                            <div class="col_percent_5">
                                                <label>Preparation Time</label>
                                                <div class="input-group bootstrap-timepicker">
                                                    <input id="timepicker_startTime" name="event_startTime" type="text" class="form_control_textField">
                                                    <span class="input-group-addon"><i class="fa fa-clock-o"></i></span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form_group_row">
                                            <div class="col_percent_7 set_padding_right_15">
                                                <label>Starting Date</label>
                                                <div class="input-group date" id="datepicker-disabled-past_endDate" data-date-format="dd/mm/yyyy" data-date-start-date="Date.default">
                                                    <input type="text" name="event_endDate" class="form_control_textField" placeholder="" data-parsley-required="true" />
                                                    <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                                </div>
                                            </div>
                                            <div class="col_percent_5">
                                                <label>Starting Time</label>
                                                <div class="input-group bootstrap-timepicker">
                                                    <input id="timepicker_endTime" name="event_endTime" type="text" class="form_control_textField">
                                                    <span class="input-group-addon"><i class="fa fa-clock-o"></i></span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form_group_row">
                                            <div class="col_percent_7 set_padding_right_15">
                                                <label>Coordinator name</label>
                                                <input name="event_name" class="form_control_textField" data-parsley-required="true">
                                            </div>
                                            <div class="col_percent_5">
                                                <label>Coordinator phone</label>
                                                <input name="event_name" class="form_control_textField" data-parsley-required="true">
                                            </div>
                                        </div>
                                        <div class="form_group_row">
                                            <label>Description</label>
                                            <textarea name="description" class="form_control_textField"></textarea>
                                        </div>
                                        <div class="form_footer_submit form_group_row">
                                            <a href="#event_imagesDescription_tab" onclick="SetNavBarActiveURL()" class="set_btn_confirm_md_backgroundWhite" type="submit">Next <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
                                            <button class="set_btn_confirm_md set_float_right" type="submit"><i class="fa fa-floppy-o" aria-hidden="true"></i> Save</button>
                                        </div>
                                    </form>
                                </div>
                                <div class="col_percent_4 box_side_response_part_request">
                                    <div class="topic">
                                        Response
                                    </div>
                                    <div class="details">
                                        <div class="box_response_each_part_requestList">
                                            <%
                                                for (int i = 0; i < 3; i++)
                                                { %>
                                            <div class="box_response_each_part_request">
                                                <div class="box_info_responder">
                                                    <span class="responder_icon"></span>
                                                    <div class="info_responder">
                                                        <span class="responder_name">Technical Department</span>
                                                        <span class="responder_dateTime">22/12/2017 14:30</span>
                                                    </div>

                                                </div>
                                                <div class="box_description_responder">
                                                    Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Nulla est. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur
                                                </div>
                                            </div>
                                                <% } %>
                                            

                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                        <div id="Properties_tab" class="tab-pane fade">
                            <div class="topic">
                                <i class="fa fa-file-text-o" aria-hidden="true"></i> Properties
                            </div>
                            <div class="details">
                                <div class="col_percent_8 set_padding_right_15">
                                    <form action="#" method="POST" data-parsley-validate="true">
                                        <div class="form_group_row set_background_for_item">
                                            <label>Table</label>
                                            <div class="box_choice_itemList">
                                                <%
                                                    for (int i = 0; i < 3; i++)
                                                    { %>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="http://benigntrading.com/gallery/TB021.jpg" />
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Chair</span>
                                                                <div class="box_item_input">
                                                                    <input class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">ตัว</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    <% } %>
                                                

                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>Chair</label>
                                            <div class="box_choice_itemList">
                                                <%
                                                    for (int i = 0; i < 3; i++)
                                                    { %>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="http://www.ikea.com/PIAimages/0449258_PE598767_S5.JPG" />
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Chair</span>
                                                                <div class="box_item_input">
                                                                    <input class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">ตัว</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    <% } %>
                                                

                                            </div>
                                        </div>

                                        <div class="form_group_row set_background_for_item">
                                            <label>Board</label>
                                            <div class="box_choice_itemList">
                                                <%
                                                    for (int i = 0; i < 3; i++)
                                                    { %>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="http://kingofwallpapers.com/board/board-006.jpg" />
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Chair</span>
                                                                <div class="box_item_input">
                                                                    <input class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">ตัว</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    <% } %>
                                               

                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>Tablecloth</label>
                                            <div class="box_choice_itemList">
                                                <%
                                                    for (int i = 0; i < 3; i++)
                                                    { %>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="https://www.fantasticfurniture.com.au/medias/?context=bWFzdGVyfGltYWdlcy9CTE1DSEExU1RPT09UVlJNQVB8NjA1MDJ8aW1hZ2UvanBlZ3xpbWFnZXMvQkxNQ0hBMVNUT09PVFZSTUFQL2g3OS9oODcvODc5OTUxODEzMDIwNi5qcGd8ZmJlNjYxOWNiZDFiZDRiM2I4M2M4ZWYyNDc3ZDZlYmExZTlkMTI1MmUyZTdlZjQ4OGJkMGRiMWUyM2MwODUzYQ" />
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Chair</span>
                                                                <div class="box_item_input">
                                                                    <input class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">ตัว</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    <% } %>
                                                

                                            </div>
                                        </div>
                                        <div class="form_group_row">
                                            <label>Description</label>
                                            <textarea name="description" class="form_control_textField"></textarea>
                                        </div>
                                        <div class="form_footer_submit form_group_row">
                                            <a href="#event_imagesDescription_tab" onclick="SetNavBarActiveURL()" class="set_btn_confirm_md_backgroundWhite" type="submit">Next <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
                                            <button class="set_btn_confirm_md set_float_right" type="submit"><i class="fa fa-floppy-o" aria-hidden="true"></i> Save</button>
                                        </div>
                                    </form>
                                </div>
                                <div class="col_percent_4 box_side_response_part_request">
                                    <div class="topic">
                                        Response
                                    </div>
                                    <div class="details">
                                        <div class="box_response_each_part_requestList">
                                            <%
                                                for (int i = 0; i < 3; i++)
                                                { %>
                                                    <div class="box_response_each_part_request">
                                                        <div class="box_info_responder">
                                                            <span class="responder_icon"></span>
                                                            <div class="info_responder">
                                                                <span class="responder_name">Technical Department</span>
                                                                <span class="responder_dateTime">22/12/2017 14:30</span>
                                                            </div>

                                                        </div>
                                                        <div class="box_description_responder">
                                                            Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Nulla est. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur
                                                        </div>
                                                    </div>
                                                
                                            <% } %>

                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                        <div id="Technical_tab" class="tab-pane fade">
                            <div class="topic">
                                <i class="fa fa-file-text-o" aria-hidden="true"></i> Technical
                            </div>
                            <div class="details">
                                <div class="col_percent_8 set_padding_right_15">
                                    <form action="#" method="POST" data-parsley-validate="true">
                                        <div class="form_group_row set_background_for_item">
                                            <label>Electricity</label>
                                            <div class="box_choice_itemList">
                                                <%
                                                    for (int i = 0; i < 3; i++)
                                                    { %>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="http://www.bbhomegroup.com/wp-content/uploads/2015/08/%E0%B8%9B%E0%B8%A5%E0%B8%B1%E0%B9%8A%E0%B8%81%E0%B9%84%E0%B8%9F.jpg" />
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Chair</span>
                                                                <div class="box_item_input">
                                                                    <input class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">ตัว</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    
                                                <% } %>

                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>Microphone</label>
                                            <div class="box_choice_itemList">
                                                <%
                                                    for (int i = 0; i < 3; i++)
                                                    { %>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="https://www.bhphotovideo.com/images/images500x500/Shure_SM58_LC_SM58_LC_Cardioid_Dynamic_68463.jpg" />
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Chair</span>
                                                                <div class="box_item_input">
                                                                    <input class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">ตัว</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    
                                                <% } %>

                                            </div>
                                        </div>

                                        <div class="form_group_row set_background_for_item">
                                            <label>Telephone</label>
                                            <div class="box_choice_itemList">
                                                <%
                                                    for (int i = 0; i < 3; i++)
                                                    { %>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="http://www.bktrade.co.th/upload/product/CK-7568-1.jpg" />
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Chair</span>
                                                                <div class="box_item_input">
                                                                    <input class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">ตัว</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    
                                                <% } %>

                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>Air conditioners</label>
                                            <div class="box_choice_itemList">
                                                <%
                                                    for (int i = 0; i < 3; i++)
                                                    { %>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="https://www.fantasticfurniture.com.au/medias/?context=bWFzdGVyfGltYWdlcy9CTE1DSEExU1RPT09UVlJNQVB8NjA1MDJ8aW1hZ2UvanBlZ3xpbWFnZXMvQkxNQ0hBMVNUT09PVFZSTUFQL2g3OS9oODcvODc5OTUxODEzMDIwNi5qcGd8ZmJlNjYxOWNiZDFiZDRiM2I4M2M4ZWYyNDc3ZDZlYmExZTlkMTI1MmUyZTdlZjQ4OGJkMGRiMWUyM2MwODUzYQ" />
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Chair</span>
                                                                <div class="box_item_input">
                                                                    <input class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">ตัว</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    
                                                <% } %>

                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>Sound</label>
                                            <div class="box_choice_itemList">
                                                <%
                                                    for (int i = 0; i < 3; i++)
                                                    { %>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="http://www.wiselifethai.com/sound/product/qsc/images/qsc_cx_amplifier.jpg" />
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Chair</span>
                                                                <div class="box_item_input">
                                                                    <input class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">ตัว</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    
                                                <% } %>

                                            </div>
                                        </div>
                                        <div class="form_group_row">
                                            <label>Description</label>
                                            <textarea name="description" class="form_control_textField"></textarea>
                                        </div>
                                        <div class="form_footer_submit form_group_row">
                                            <a href="#event_imagesDescription_tab" onclick="SetNavBarActiveURL()" class="set_btn_confirm_md_backgroundWhite" type="submit">Next <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
                                            <button class="set_btn_confirm_md set_float_right" type="submit"><i class="fa fa-floppy-o" aria-hidden="true"></i> Save</button>
                                        </div>
                                    </form>
                                </div>
                                <div class="col_percent_4 box_side_response_part_request">
                                    <div class="topic">
                                        Response
                                    </div>
                                    <div class="details">
                                        <div class="box_response_each_part_requestList">
                                            <%
                                                for (int i = 0; i < 3; i++)
                                                { %>
                                                    <div class="box_response_each_part_request">
                                                        <div class="box_info_responder">
                                                            <span class="responder_icon"></span>
                                                            <div class="info_responder">
                                                                <span class="responder_name">Technical Department</span>
                                                                <span class="responder_dateTime">22/12/2017 14:30</span>
                                                            </div>

                                                        </div>
                                                        <div class="box_description_responder">
                                                            Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Nulla est. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur
                                                        </div>
                                                    </div>
                                               
                                            <% } %>

                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                        <div id="SoundLight_tab" class="tab-pane fade">
                            <div class="topic">
                                <i class="fa fa-file-text-o" aria-hidden="true"></i> Sound & Light
                            </div>
                            <div class="details">
                                <div class="col_percent_8 set_padding_right_15">
                                    <form action="#" method="POST" data-parsley-validate="true">
                                        <div class="form_group_row set_background_for_item">
                                            <label>Microphone</label>
                                            <div class="box_choice_itemList">
                                                <%
                                                    for (int i = 0; i < 3; i++)
                                                    { %>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="http://www.toa.jp/assets/images/TOAProduct/dm1300_pn1e.jpg" />
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Chair</span>
                                                                <div class="box_item_input">
                                                                    <input class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">ตัว</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    
                                                <% } %>

                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>Microphone</label>
                                            <div class="box_choice_itemList">
                                                <%
                                                    for (int i = 0; i < 3; i++)
                                                    { %>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="https://www.bhphotovideo.com/images/images500x500/Shure_SM58_LC_SM58_LC_Cardioid_Dynamic_68463.jpg" />
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Chair</span>
                                                                <div class="box_item_input">
                                                                    <input class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">ตัว</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    
                                                <% } %>

                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>Projector</label>
                                            <div class="box_choice_itemList">
                                                <%
                                                    for (int i = 0; i < 3; i++)
                                                    { %>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="http://www.projectorreviews.com/resize/622x335/r/wp-content/uploads/2015/04/G6550WU_front-beauty.jpg" />
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Chair</span>
                                                                <div class="box_item_input">
                                                                    <input class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">ตัว</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    
                                                <% } %>

                                            </div>
                                        </div>
                                        <div class="form_group_row">
                                            <label>Description</label>
                                            <textarea name="description" class="form_control_textField"></textarea>
                                        </div>
                                        <div class="form_footer_submit form_group_row">
                                            <a href="#event_imagesDescription_tab" onclick="SetNavBarActiveURL()" class="set_btn_confirm_md_backgroundWhite" type="submit">Next <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
                                            <button class="set_btn_confirm_md set_float_right" type="submit"><i class="fa fa-floppy-o" aria-hidden="true"></i> Save</button>
                                        </div>
                                    </form>
                                </div>
                                <div class="col_percent_4 box_side_response_part_request">
                                    <div class="topic">
                                        Response
                                    </div>
                                    <div class="details">
                                        <div class="box_response_each_part_requestList">
                                            <%
                                                for (int i = 0; i < 3; i++)
                                                { %>
                                                    <div class="box_response_each_part_request">
                                                        <div class="box_info_responder">
                                                            <span class="responder_icon"></span>
                                                            <div class="info_responder">
                                                                <span class="responder_name">Technical Department</span>
                                                                <span class="responder_dateTime">22/12/2017 14:30</span>
                                                            </div>

                                                        </div>
                                                        <div class="box_description_responder">
                                                            Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Nulla est. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur
                                                        </div>
                                                    </div>
                                                
                                            <% } %>

                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                        <div id="ArtsCulture_tab" class="tab-pane fade">
                            <div class="topic">
                                <i class="fa fa-file-text-o" aria-hidden="true"></i> Arts & Culture
                            </div>
                            <div class="details">
                                <div class="col_percent_8 set_padding_right_15">
                                    <form action="#" method="POST" data-parsley-validate="true">
                                        <div class="form_group_row set_background_for_item">
                                            <label>Foam</label>
                                            <div class="box_choice_itemList">
                                                <%
                                                    for (int i = 0; i < 3; i++)
                                                    { %>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="http://architservice.kku.ac.th/wp-content/uploads/2014/07/IMG_0685.jpg" />
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Form</span>
                                                                <div class="box_item_input">
                                                                    <input class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">ตัว</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    
                                                <% } %>

                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>ป้ายบอกทาง</label>
                                            <div class="box_choice_itemList">
                                                <%
                                                    for (int i = 0; i < 3; i++)
                                                    { %>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="http://ร้านป้ายยโสธร.com/pic4/DSC09580.JPG" />
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Chair</span>
                                                                <div class="box_item_input">
                                                                    <input class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">ตัว</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                   
                                                <% } %>

                                            </div>
                                        </div>
                                        <div class="form_group_row">
                                            <label>Description</label>
                                            <textarea name="description" class="form_control_textField"></textarea>
                                        </div>
                                        <div class="form_footer_submit form_group_row">
                                            <a href="#event_imagesDescription_tab" onclick="SetNavBarActiveURL()" class="set_btn_confirm_md_backgroundWhite" type="submit">Next <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
                                            <button class="set_btn_confirm_md set_float_right" type="submit"><i class="fa fa-floppy-o" aria-hidden="true"></i> Save</button>
                                        </div>
                                    </form>
                                </div>
                                <div class="col_percent_4 box_side_response_part_request">
                                    <div class="topic">
                                        Response
                                    </div>
                                    <div class="details">
                                        <div class="box_response_each_part_requestList">
                                            <%
                                                for (int i = 0; i < 3; i++)
                                                { %>
                                                    <div class="box_response_each_part_request">
                                                        <div class="box_info_responder">
                                                            <span class="responder_icon"></span>
                                                            <div class="info_responder">
                                                                <span class="responder_name">Technical Department</span>
                                                                <span class="responder_dateTime">22/12/2017 14:30</span>
                                                            </div>

                                                        </div>
                                                        <div class="box_description_responder">
                                                            Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Nulla est. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur
                                                        </div>
                                                    </div>
                                                
                                            <% } %>

                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                        <div id="Security_tab" class="tab-pane fade">
                            <div class="topic">
                                <i class="fa fa-file-text-o" aria-hidden="true"></i> Security
                            </div>
                            <div class="details">
                                <div class="col_percent_8 set_padding_right_15">
                                    <form action="#" method="POST" data-parsley-validate="true">
                                        <div class="form_group_row set_background_for_item">
                                            <label>ที่จอดรถ</label>
                                            <div class="box_choice_itemList">
                                                <%
                                                    for (int i = 0; i < 3; i++)
                                                    { %>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="http://benigntrading.com/gallery/TB021.jpg" />
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">ส่วนบุคคล</span>
                                                                <div class="box_item_input">
                                                                    <input class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">คัน</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    
                                                <% } %>

                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>พนักงานรักษาความปลอดภัย</label>
                                            <div class="box_choice_itemList">
                                                <%
                                                    for (int i = 0; i < 3; i++)
                                                    { %>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="http://www.ikea.com/PIAimages/0449258_PE598767_S5.JPG" />
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">123</span>
                                                                <div class="box_item_input">
                                                                    <input class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">คน</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    
                                                <% } %>

                                            </div>
                                        </div>
                                        <div class="form_group_row">
                                            <label>Description</label>
                                            <textarea name="description" class="form_control_textField"></textarea>
                                        </div>
                                        <div class="form_footer_submit form_group_row">
                                            <a href="#event_imagesDescription_tab" onclick="SetNavBarActiveURL()" class="set_btn_confirm_md_backgroundWhite" type="submit">Next <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
                                            <button class="set_btn_confirm_md set_float_right" type="submit"><i class="fa fa-floppy-o" aria-hidden="true"></i> Save</button>
                                        </div>
                                    </form>
                                </div>
                                <div class="col_percent_4 box_side_response_part_request">
                                    <div class="topic">
                                        Response
                                    </div>
                                    <div class="details">
                                        <div class="box_response_each_part_requestList">
                                            <%
                                                for (int i = 0; i < 3; i++)
                                                { %>
                                                    <div class="box_response_each_part_request">
                                                        <div class="box_info_responder">
                                                            <span class="responder_icon"></span>
                                                            <div class="info_responder">
                                                                <span class="responder_name">Technical Department</span>
                                                                <span class="responder_dateTime">22/12/2017 14:30</span>
                                                            </div>

                                                        </div>
                                                        <div class="box_description_responder">
                                                            Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Nulla est. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur
                                                        </div>
                                                    </div>
                                                
                                            <% } %>

                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                        <div id="IT_tab" class="tab-pane fade">
                            <div class="topic">
                                <i class="fa fa-file-text-o" aria-hidden="true"></i> IT
                            </div>
                            <div class="details">
                                <div class="col_percent_8 set_padding_right_15">
                                    <form action="#" method="POST" data-parsley-validate="true">
                                        <div class="form_group_row set_background_for_item">
                                            <label>LCD Projector</label>
                                            <div class="box_choice_itemList">
                                                <%
                                                    for (int i = 0; i < 3; i++)
                                                    { %>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="https://img.tradeindia.com/fp/5/592/216.jpg" />
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Projector</span>
                                                                <div class="box_item_input">
                                                                    <input class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">ตัว</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    
                                                <% } %>

                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>Notebook</label>
                                            <div class="box_choice_itemList">
                                                <%
                                                    for (int i = 0; i < 3; i++)
                                                    { %>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="https://notebookspec.com/nbs/upload_notebook/20160329-143740_ASUS_VivoBook_E200HA-US01.jpg" />
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Notebook</span>
                                                                <div class="box_item_input">
                                                                    <input class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">ตัว</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    
                                                <% } %>

                                            </div>
                                        </div>

                                        <div class="form_group_row set_background_for_item">
                                            <label>Computer</label>
                                            <div class="box_choice_itemList">
                                                <%
                                                    for (int i = 0; i < 3; i++)
                                                    { %>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="http://www.ekkapol.com/images/acer.jpg" />
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Computer</span>
                                                                <div class="box_item_input">
                                                                    <input class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">ตัว</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    
                                                <% } %>

                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>Visualizer</label>
                                            <div class="box_choice_itemList">
                                                <%
                                                    for (int i = 0; i < 3; i++)
                                                    { %>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="https://upload.wikimedia.org/wikipedia/commons/5/53/%E0%B9%80%E0%B8%84%E0%B8%A3%E0%B8%B2%E0%B8%B7%E0%B9%88%E0%B8%AD%E0%B8%87.jpg" />
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Visualizer</span>
                                                                <div class="box_item_input">
                                                                    <input class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">เครื่อง</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    
                                                <% } %>

                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>Screen</label>
                                            <div class="box_choice_itemList">
                                                <%
                                                    for (int i = 0; i < 3; i++)
                                                    { %>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="http://www.techtravelagent.com/images/ProjectorScreen.jpg" />
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Screen</span>
                                                                <div class="box_item_input">
                                                                    <input class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">จอ</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    
                                                <% } %>

                                            </div>
                                        </div>
                                        <div class="form_group_row">
                                            <label>Description</label>
                                            <textarea name="description" class="form_control_textField"></textarea>
                                        </div>
                                        <div class="form_footer_submit form_group_row">
                                            <a href="#event_imagesDescription_tab" onclick="SetNavBarActiveURL()" class="set_btn_confirm_md_backgroundWhite" type="submit">Next <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
                                            <button class="set_btn_confirm_md set_float_right" type="submit"><i class="fa fa-floppy-o" aria-hidden="true"></i> Save</button>
                                        </div>
                                    </form>
                                </div>
                                <div class="col_percent_4 box_side_response_part_request">
                                    <div class="topic">
                                        Response
                                    </div>
                                    <div class="details">
                                        <div class="box_response_each_part_requestList">
                                            <%
                                                for (int i = 0; i < 3; i++)
                                                { %>
                                            <div class="box_response_each_part_request">
                                                <div class="box_info_responder">
                                                    <span class="responder_icon"></span>
                                                    <div class="info_responder">
                                                        <span class="responder_name">Technical Department</span>
                                                        <span class="responder_dateTime">22/12/2017 14:30</span>
                                                    </div>

                                                </div>
                                                <div class="box_description_responder">
                                                    Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Nulla est. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur
                                                </div>
                                            </div>
                                                <% } %>
                                            <% } %>

                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>