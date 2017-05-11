
<c:set var="userProfile" value="${userProfile}" />
<c:set var="formTypeName" value="${userProfile.responsible_form_type_name}" />
<c:set var="formDetails" value="${formDetails}" />

<!-- Property -->
<c:set var="formDepartment_properties" value="${formDepartment_properties}" />
<c:set var="properties_requestedItemList" value="${formDepartment_properties.requestedItemList}" />

<!-- Technical -->
<c:set var="formDepartment_technical" value="${formDepartment_technical}" />
<c:set var="technical_requestedItemList" value="${formDepartment_technical.requestedItemList}" />

<!-- Sound & Light -->
<c:set var="formDepartment_soundAndLight" value="${formDepartment_soundAndLight}" />
<c:set var="soundAndLight_requestedItemList" value="${formDepartment_soundAndLight.requestedItemList}" />

<!-- Art & Culture -->
<c:set var="formDepartment_artAndCulture" value="${formDepartment_artAndCulture}" />
<c:set var="artAndCulture_requestedItemList" value="${formDepartment_artAndCulture.requestedItemList}" />

<!-- Security -->
<c:set var="formDepartment_secuity" value="${formDepartment_secuity}" />
<c:set var="secuity_requestedItemList" value="${formDepartment_secuity.requestedItemList}" />

<!-- IT -->
<c:set var="formDepartment_IT" value="${formDepartment_IT}" />
<c:set var="IT_requestedItemList" value="${formDepartment_IT.requestedItemList}" />


<c:set var="responseMessageList_1" value="${responseMessageList_1}" /> <!-- Property -->
<c:set var="responseMessageList_2" value="${responseMessageList_2}" /> <!-- Technical -->
<c:set var="responseMessageList_3" value="${responseMessageList_3}" /> <!-- Sound & Light -->
<c:set var="responseMessageList_4" value="${responseMessageList_4}" /> <!-- Art & Culture -->
<c:set var="responseMessageList_5" value="${responseMessageList_5}" /> <!-- Security -->
<c:set var="responseMessageList_6" value="${responseMessageList_6}" /> <!-- IT -->

<div class="set_background_screen_2 set_margin_container_default_10">
    <div class="box_layer_info_3">
        <div class="title">
            <div class="container_new">
                <span class="topic">Details</span>
                <div class="set_float_right">
                    <c:if test="${userProfile.responsible_form_type_id == 2}">
                        <a class="set_float_right set_btn_approve_sm" href="${pageContext.request.contextPath}/Supervisor/Status?id=${formDetails.form_id}&isApprove=true"><i class="fa fa-check" aria-hidden="true"></i> Approve</a>
                        <a class="set_float_right set_btn_delete_sm set_margin_right_10" href="${pageContext.request.contextPath}/Supervisor/Status?id=${formDetails.form_id}&isApprove=false"><i class="fa fa-times" aria-hidden="true"></i> Reject</a>
                    </c:if>
                    <c:if test="${userProfile.responsible_form_type_id == 3}">
                        <a class="set_float_right set_btn_approve_sm" href="${pageContext.request.contextPath}/AdminDirector/Status?id=${formDetails.form_id}&isApprove=true"><i class="fa fa-check" aria-hidden="true"></i> Approve</a>
                        <a class="set_float_right set_btn_delete_sm set_margin_right_10" href="${pageContext.request.contextPath}/AdminDirector/Status?id=${formDetails.form_id}&isApprove=false"><i class="fa fa-times" aria-hidden="true"></i> Reject</a>
                    </c:if>
                </div>

            </div>
        </div>
        <div class="container_new">
            <div class="details">
                <div class="box_organinzer_event set_margin_container_default_10">
                    <ul id="navtabs_create_member" class="nav_tabs_box_organinzer_event nav nav-tabs">
                        <li class="active"><a data-toggle="tab" href="#Details_tab">Details</a></li>
                            <c:if test="${(userProfile.responsible_form_type_id <= 3) || $(userProfile.responsible_form_type_id == 4)}">
                            <li><a data-toggle="tab" href="#Properties_tab">Properties</a></li>
                            </c:if>
                            <c:if test="${(userProfile.responsible_form_type_id <= 3) || (userProfile.responsible_form_type_id == 5)}">
                            <li><a data-toggle="tab" href="#Technical_tab">Technical</a></li>
                            </c:if>
                            <c:if test="${(userProfile.responsible_form_type_id <= 3) || (userProfile.responsible_form_type_id == 6)}">
                            <li><a data-toggle="tab" href="#SoundLight_tab">Sound & Light</a></li>
                            </c:if>
                            <c:if test="${(userProfile.responsible_form_type_id <= 3) || (userProfile.responsible_form_type_id == 7)}">
                            <li><a data-toggle="tab" href="#ArtsCulture_tab">Arts & Culture</a></li>
                            </c:if>
                            <c:if test="${(userProfile.responsible_form_type_id <= 3) || (userProfile.responsible_form_type_id == 8)}">
                            <li><a data-toggle="tab" href="#Security_tab">Security</a></li>
                            </c:if>
                            <c:if test="${(userProfile.responsible_form_type_id <= 3) || (userProfile.responsible_form_type_id == 9)}">
                            <li><a data-toggle="tab" href="#IT_tab">IT</a></li>
                            </c:if>     
                    </ul>
                    <div class="tab_content tab-content">
                        <form action="${pageContext.servletContext.contextPath}/${formTypeName}/Details?id=${formDetails.form_id}" method="POST" data-parsley-validate="true">
                            <div id="Details_tab" class="tab-pane fade in active">
                                <div class="topic">
                                    <i class="fa fa-file-text-o" aria-hidden="true"></i> Details
                                </div>
                                <div class="details">
                                    <div class="col_percent_8 set_padding_right_15 set_padding_right_15">

                                        <div class="form_group_row">
                                            <label>Job/Activity name</label>
                                            <input name="form_name" class="form_control_textField" value="${formDetails.event_name}" data-parsley-required="true">
                                        </div>
                                        <div class="form_group_row">
                                            <div class="col_percent_7 set_padding_right_15">
                                                <label>Job Function / Activities</label>
                                                <input name="form_activity_type" class="form_control_textField" value="${formDetails.activity}" data-parsley-required="true">
                                            </div>
                                            <div class="col_percent_5">
                                                <label>Faculty / Department</label>
                                                <input name="form_department" class="form_control_textField" value="${formDetails.department}" data-parsley-required="true">
                                            </div>
                                        </div>
                                        <div class="form_group_row">
                                            <label>Place</label>
                                            <c:if test="${(formDetails.campus == 'Huamak')}">
                                                <div class="box_each_checkbox_radio">                                      
                                                    <input id="radio-require_form_1" name="form_place" class="radio-custom" value="Huamak" type="radio" checked>
                                                    <label for="radio-require_form_1" class="radio-custom-label"> Huamak</label>    
                                                </div>
                                                <div class="box_each_checkbox_radio">
                                                    <input id="radio-require_form_2" name="form_place" class="radio-custom" value="Bangna" type="radio">
                                                    <label for="radio-require_form_2" class="radio-custom-label"> Bangna</label>
                                                </div>
                                            </c:if>
                                            <c:if test="${(formDetails.campus != 'Huamak')}">
                                                <div class="box_each_checkbox_radio">                                      
                                                    <input id="radio-require_form_3" name="form_place" class="radio-custom" value="Huamak" type="radio">
                                                    <label for="radio-require_form_3" class="radio-custom-label"> Huamak</label>    
                                                </div>
                                                <div class="box_each_checkbox_radio">
                                                    <input id="radio-require_form_4" name="form_place" class="radio-custom" value="Bangna" type="radio" checked>
                                                    <label for="radio-require_form_4" class="radio-custom-label"> Bangna</label>
                                                </div>
                                            </c:if>
                                        </div>
                                        <div class="form_group_row">
                                            <label>Room/Facilities</label>
                                            <input name="form_room" class="form_control_textField" value="${formDetails.facility}">
                                        </div>
                                        <div class="form_group_row">
                                            <div class="col_percent_7 set_padding_right_15">
                                                <label>Preparation Date</label>
                                                <div class="input-group date" id="datepicker-disabled-past_pre_startDate" data-date-format="dd/mm/yyyy" data-date-start-date="Date.default">
                                                    <input type="text" name="pre_start_date" class="form_control_textField" value="${formDetails.pre_date_show}" placeholder="" data-parsley-required="true" />
                                                    <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                                </div>
                                            </div>
                                            <div class="col_percent_5">
                                                <label>Preparation Time</label>
                                                <div class="input-group bootstrap-timepicker">
                                                    <input id="timepicker_pre_startTime" name="pre_start_time" type="text" value="${formDetails.pre_time_show}" class="form_control_textField">
                                                    <span class="input-group-addon"><i class="fa fa-clock-o"></i></span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form_group_row">
                                            <div class="col_percent_7 set_padding_right_15">
                                                <label>Starting Date</label>
                                                <div class="input-group date" id="datepicker-disabled-past_startDate" data-date-format="dd/mm/yyyy" data-date-start-date="Date.default">
                                                    <input type="text" name="start_date" class="form_control_textField" value="${formDetails.start_date_show}" placeholder="" data-parsley-required="true" />
                                                    <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                                </div>
                                            </div>
                                            <div class="col_percent_5">
                                                <label>Starting Time</label>
                                                <div class="input-group bootstrap-timepicker">
                                                    <input id="timepicker_startTime" name="start_time" type="text" value="${formDetails.start_time_show}" class="form_control_textField">
                                                    <span class="input-group-addon"><i class="fa fa-clock-o"></i></span>
                                                </div>
                                            </div>
                                        </div>
                                        <!--                                        <div class="form_group_row">
                                                                                    <div class="col_percent_7 set_padding_right_15">
                                                                                        <label>Ending Date</label>
                                                                                        <div class="input-group date" id="datepicker-disabled-past_endDate" data-date-format="dd/mm/yyyy" data-date-start-date="Date.default">
                                                                                            <input type="text" name="end_date" class="form_control_textField" placeholder="" data-parsley-required="true" />
                                                                                            <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                                                                        </div>
                                                                                    </div>
                                                                                    <div class="col_percent_5">
                                                                                        <label>Ending Time</label>
                                                                                        <div class="input-group bootstrap-timepicker">
                                                                                            <input id="timepicker_endTime" name="end_time" type="text" class="form_control_textField">
                                                                                            <span class="input-group-addon"><i class="fa fa-clock-o"></i></span>
                                                                                        </div>
                                                                                    </div>
                                                                                </div>-->
                                        <div class="form_group_row">
                                            <div class="col_percent_7 set_padding_right_15">
                                                <label>Coordinator name</label>
                                                <input name="coordinator_name" value="${formDetails.coordinator_name}" class="form_control_textField" data-parsley-required="true">
                                            </div>
                                            <div class="col_percent_5">
                                                <label>Coordinator phone</label>
                                                <input name="coordinator_phone" value="${formDetails.coordinator_phone_number}" class="form_control_textField" data-parsley-required="true">
                                            </div>
                                        </div>
                                        <div class="form_group_row">
                                            <label>Description</label>
                                            <textarea name="0_description" class="form_control_textField">${formDetails.description}</textarea>
                                        </div>
                                        
                                        <c:if test="${userProfile.responsible_form_type_id == 1}">
                                            <div class="form_footer_submit form_group_row">
                                                <a href="#event_imagesDescription_tab" onclick="SetNavBarActiveURL()" class="set_btn_confirm_md_backgroundWhite" type="submit">Next <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
                                            <button class="set_btn_confirm_md set_float_right" type="submit"><i class="fa fa-floppy-o" aria-hidden="true"></i> Save</button>
                                        </div>
                                        </c:if>
                                    </div>
                                    
                            <div class="col_percent_4 box_side_response_part_request">
                                <div class="topic">
                                    Response
                                </div>
                                <div class="details">
                                    <div class="box_response_each_part_requestList">
                                        <c:forEach items="${responseMessageList_1}" var="responseMessage">
                                            <div class="box_response_each_part_request">
                                                <div class="box_info_responder">
                                                    <span class="responder_icon"></span>
                                                    <div class="info_responder">
                                                        <span class="responder_name">${responseMessage.form_department_name}</span>
                                                        <span class="responder_dateTime">${responseMessage.updated_date}</span>
                                                    </div>
                                                </div>
                                                <div class="box_description_responder">
                                                    ${responseMessage.message}
                                                </div>
                                            </div>
                                        </c:forEach>  
                                    </div> 
                                    <div class="box_add_response_description">
                                        <textarea class="form_control_textField"></textarea>
                                        <button class="set_btn_confirm_sm_backgroundWhite set_float_right set_margin_top_10">Add Response</button>
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
                                   
                                        <div class="form_group_row set_background_for_item">
                                            <label>Table</label>
                                            <div class="box_choice_itemList">
                                               
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="${pageContext.request.contextPath}/Images/1_Properties/FoldingTableWhite.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Folding Table White</span>
                                                                <div class="box_item_input">
                                                                    <input name="1_FoldingTableWhite" value="${properties_requestedItemList[0].quantity}" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                   <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/1_Properties/FoldingTableRoundWhite.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Folding Table Round White</span>
                                                                <div class="box_item_input">
                                                                    <input name="1_FoldingTableRoundWhite" value="${properties_requestedItemList[1].quantity}" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>

                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>Chair</label>
                                            <div class="box_choice_itemList">
                                                <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                <img src="${pageContext.request.contextPath}/Images/1_Properties/ChairCrown.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Chair Crown</span>
                                                                <div class="box_item_input">
                                                                    <input name="1_ChairCrown" value="${properties_requestedItemList[2].quantity}" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                   <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/1_Properties/ChairSteel.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Chair Steel</span>
                                                                <div class="box_item_input">
                                                                    <input name="1_ChairSteel" value="${properties_requestedItemList[3].quantity}" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>

                                            </div>
                                        </div>

                                        <div class="form_group_row set_background_for_item">
                                            <label>Board</label>
                                            <div class="box_choice_itemList">
                                                <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/1_Properties/BoardMoveable.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Board Moveable</span>
                                                                <div class="box_item_input">
                                                                    <input value="${properties_requestedItemList[4].quantity}" name="1_BoardMoveable" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                               

                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>Tablecloth</label>
                                            <div class="box_choice_itemList">
                                                <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/1_Properties/TableClothBlue.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Table Cloth Blue</span>
                                                                <div class="box_item_input">
                                                                    <input value="${properties_requestedItemList[5].quantity}" name="1_TableClothBlue" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/1_Properties/TableClothRound.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Table Cloth Round</span>
                                                                <div class="box_item_input">
                                                                    <input value="${properties_requestedItemList[6].quantity}" name="1_TableClothRound" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>

                                            </div>
                                        </div>
                                        <div class="form_group_row">
                                            <label>Description</label>
                                            <textarea name="1_description" class="form_control_textField">${formDepartment_properties.description}</textarea>
                                        </div>
                                        
                                        <c:if test="${userProfile.responsible_form_type_id == 1}">
                                            <div class="form_footer_submit form_group_row">
                                            <a href="#event_imagesDescription_tab" onclick="SetNavBarActiveURL()" class="set_btn_confirm_md_backgroundWhite" type="submit">Next <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
                                            <button class="set_btn_confirm_md set_float_right" type="submit"><i class="fa fa-floppy-o" aria-hidden="true"></i> Save</button>
                                        </div> 
                                        </c:if>
                                </div>
                                <div class="col_percent_4 box_side_response_part_request">
                                    <div class="topic">
                                        Response
                                    </div>
                                    <div class="details">
                                        <div class="box_response_each_part_requestList">
                                            <c:forEach items="${responseMessageList_1}" var="responseMessage">
                                                <div class="box_response_each_part_request">
                                                    <div class="box_info_responder">
                                                        <span class="responder_icon"></span>
                                                        <div class="info_responder">
                                                            <span class="responder_name">${responseMessage.form_department_name}</span>
                                                            <span class="responder_dateTime">${responseMessage.updated_date}</span>
                                                        </div>
                                                    </div>
                                                    <div class="box_description_responder">
                                                        ${responseMessage.message}
                                                    </div>
                                                </div>
                                            </c:forEach>

                                        </div>
                                        <div class="box_add_response_description">
                                            <textarea class="form_control_textField"></textarea>
                                            <button class="set_btn_confirm_sm_backgroundWhite set_float_right set_margin_top_10">Add Response</button>
                                        </div>
                                    </div>
                                            <img src="${pageContext.request.contextPath}../../../Images/3_Sound & Light/MicrophoneWithShortStand.jpg" alt=""/>
                                </div>
                            </div>
                        </div>
                        <div id="Technical_tab" class="tab-pane fade">
                            <div class="topic">
                                <i class="fa fa-file-text-o" aria-hidden="true"></i> Technical
                            </div>
                            <div class="details">
                                <div class="col_percent_8 set_padding_right_15">
                                    
                                        <div class="form_group_row set_background_for_item">
                                            <label>Electricity</label>
                                            <div class="box_choice_itemList">
                                                <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/2_Technical/ExtensionCordsLenght.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Extension Cords Lenght</span>
                                                                <div class="box_item_input">
                                                                    <input value="${technical_requestedItemList[0].quantity}" name="2_ExtensionCordsLenght" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/2_Technical/ExtensionCordsRoll.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">ExtensionCordsRoll</span>
                                                                <div class="box_item_input">
                                                                    <input value="${technical_requestedItemList[1].quantity}" name="2_ExtensionCordsRoll" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>Microphone</label>
                                            <div class="box_choice_itemList">
                                                <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/2_Technical/MicrophoneWithShortStand.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Microphone With Short Stand</span>
                                                                <div class="box_item_input">
                                                                    <input value="${technical_requestedItemList[2].quantity}" name="2_MicrophoneWithShortStand" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/2_Technical/MicrophoneWithStand.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Microphone With Stand</span>
                                                                <div class="box_item_input">
                                                                    <input value="${technical_requestedItemList[3].quantity}" name="2_MicrophoneWithStand" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                            </div>
                                        </div>

                                        <div class="form_group_row set_background_for_item">
                                            <label>Telephone</label>
                                            <div class="box_choice_itemList">
                                               <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/2_Technical/PhoneOfficeWhite.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Phone Office</span>
                                                                <div class="box_item_input">
                                                                    <input value="${technical_requestedItemList[4].quantity}" name="2_PhoneOfficeWhite" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>

                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>Air conditioners</label>
                                            <div class="box_choice_itemList">
                                                <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/2_Technical/AirConditioner.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Air Conditioner</span>
                                                                <div class="box_item_input">
                                                                    <input value="${technical_requestedItemList[5].quantity}" name="2_AirConditioner" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>

                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>Sound</label>
                                            <div class="box_choice_itemList">
                                                <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/2_Technical/sound1.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">sound1</span>
                                                                <div class="box_item_input">
                                                                    <input value="${technical_requestedItemList[6].quantity}" name="2_sound1" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/2_Technical/sound2.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">sound2</span>
                                                                <div class="box_item_input">
                                                                    <input value="${technical_requestedItemList[7].quantity}" name="2_sound2" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>

                                            </div>
                                        </div>
                                        <div class="form_group_row">
                                            <label>Description</label>
                                            <textarea name="2_description" class="form_control_textField">${formDepartment_technical.description}</textarea>
                                        </div>
                                        
                                        <c:if test="${userProfile.responsible_form_type_id == 1}">
                                            <div class="form_footer_submit form_group_row">
                                            <a href="#event_imagesDescription_tab" onclick="SetNavBarActiveURL()" class="set_btn_confirm_md_backgroundWhite" type="submit">Next <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
                                            <button class="set_btn_confirm_md set_float_right" type="submit"><i class="fa fa-floppy-o" aria-hidden="true"></i> Save</button>
                                        </div> 
                                        </c:if>
                                    
                                </div>
                                <div class="col_percent_4 box_side_response_part_request">
                                    <div class="topic">
                                        Response
                                    </div>
                                    <div class="details">
                                        <div class="box_response_each_part_requestList">
                                            <c:forEach items="${responseMessageList_2}" var="responseMessage">
                                                <div class="box_response_each_part_request">
                                                    <div class="box_info_responder">
                                                        <span class="responder_icon"></span>
                                                        <div class="info_responder">
                                                            <span class="responder_name">${responseMessage.form_department_name}</span>
                                                            <span class="responder_dateTime">${responseMessage.updated_date}</span>
                                                        </div>
                                                    </div>
                                                    <div class="box_description_responder">
                                                        ${responseMessage.message}
                                                    </div>
                                                </div>
                                            </c:forEach>

                                        </div>
                                        <div class="box_add_response_description">
                                            <textarea class="form_control_textField"></textarea>
                                            <button class="set_btn_confirm_sm_backgroundWhite set_float_right set_margin_top_10">Add Response</button>
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
                                  
                                        <div class="form_group_row set_background_for_item">
                                            <label>Microphone</label>
                                            <div class="box_choice_itemList">
                                                <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}${pageContext.request.contextPath}/Images/3_Sound & Light/MicrophoneWithShortStand.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Microphone With Short Stand</span>
                                                                <div class="box_item_input">
                                                                    <input value="${soundAndLight_requestedItemList[0].quantity}" name="3_MicrophoneWithShortStand" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/3_Sound & Light/MicrophoneWithStand.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Microphone With Stand</span>
                                                                <div class="box_item_input">
                                                                    <input value="${soundAndLight_requestedItemList[1].quantity}" name="3_MicrophoneWithStand" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>Projector</label>
                                            <div class="box_choice_itemList">
                                                <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/3_Sound & Light/Projector.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Projector</span>
                                                                <div class="box_item_input">
                                                                    <input value="${soundAndLight_requestedItemList[2].quantity}" name="3_Projector" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/3_Sound & Light/ProjectorScreen01.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Projector Screen</span>
                                                                <div class="box_item_input">
                                                                    <input value="${soundAndLight_requestedItemList[3].quantity}" name="3_ProjectorScreen" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                            </div>
                                        </div>
                                        <div class="form_group_row">
                                            <label>Description</label>
                                            <textarea name="3_description" class="form_control_textField">${formDepartment_soundAndLight.description}</textarea>
                                        </div>
                                        <c:if test="${userProfile.responsible_form_type_id == 1}">
                                            <div class="form_footer_submit form_group_row">
                                            <a href="#event_imagesDescription_tab" onclick="SetNavBarActiveURL()" class="set_btn_confirm_md_backgroundWhite" type="submit">Next <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
                                            <button class="set_btn_confirm_md set_float_right" type="submit"><i class="fa fa-floppy-o" aria-hidden="true"></i> Save</button>
                                        </div> 
                                        </c:if>
                                   
                                </div>
                                <div class="col_percent_4 box_side_response_part_request">
                                    <div class="topic">
                                        Response
                                    </div>
                                    <div class="details">
                                        <div class="box_response_each_part_requestList">
                                            <c:forEach items="${responseMessageList_3}" var="responseMessage">
                                                <div class="box_response_each_part_request">
                                                    <div class="box_info_responder">
                                                        <span class="responder_icon"></span>
                                                        <div class="info_responder">
                                                            <span class="responder_name">${responseMessage.form_department_name}</span>
                                                            <span class="responder_dateTime">${responseMessage.updated_date}</span>
                                                        </div>
                                                    </div>
                                                    <div class="box_description_responder">
                                                        ${responseMessage.message}
                                                    </div>
                                                </div>
                                            </c:forEach>

                                        </div>
                                        <div class="box_add_response_description">
                                            <textarea class="form_control_textField"></textarea>
                                            <button class="set_btn_confirm_sm_backgroundWhite set_float_right set_margin_top_10">Add Response</button>
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
           
                                        <div class="form_group_row set_background_for_item">
                                            <label>Foam</label>
                                            <div class="box_choice_itemList">
                                                <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/4_Arts & Culture/FoamLetters.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Foam Letters</span>
                                                                <div class="box_item_input">
                                                                    <input value="${artAndCulture_requestedItemList[0].quantity}" name="4_FoamLetters" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>

                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>Guide post</label>
                                            <div class="box_choice_itemList">
                                                <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/4_Arts & Culture/DirectionSign.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Direction Sign</span>
                                                                <div class="box_item_input">
                                                                    <input value="${artAndCulture_requestedItemList[1].quantity}" name="4_DirectionSign" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>

                                            </div>
                                        </div>
                                        <div class="form_group_row">
                                            <label>Description</label>
                                            <textarea name="4_description" class="form_control_textField">${formDepartment_artAndCulture.description}</textarea>
                                        </div>
                                        <c:if test="${userProfile.responsible_form_type_id == 1}">
                                            <div class="form_footer_submit form_group_row">
                                            <a href="#event_imagesDescription_tab" onclick="SetNavBarActiveURL()" class="set_btn_confirm_md_backgroundWhite" type="submit">Next <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
                                            <button class="set_btn_confirm_md set_float_right" type="submit"><i class="fa fa-floppy-o" aria-hidden="true"></i> Save</button>
                                        </div> 
                                        </c:if>
                                 
                                </div>
                                <div class="col_percent_4 box_side_response_part_request">
                                    <div class="topic">
                                        Response
                                    </div>
                                    <div class="details">
                                        <div class="box_response_each_part_requestList">
                                            <c:forEach items="${responseMessageList_4}" var="responseMessage">
                                                <div class="box_response_each_part_request">
                                                    <div class="box_info_responder">
                                                        <span class="responder_icon"></span>
                                                        <div class="info_responder">
                                                            <span class="responder_name">${responseMessage.form_department_name}</span>
                                                            <span class="responder_dateTime">${responseMessage.updated_date}</span>
                                                        </div>
                                                    </div>
                                                    <div class="box_description_responder">
                                                        ${responseMessage.message}
                                                    </div>
                                                </div>
                                            </c:forEach>

                                        </div>
                                        <div class="box_add_response_description">
                                            <textarea class="form_control_textField"></textarea>
                                            <button class="set_btn_confirm_sm_backgroundWhite set_float_right set_margin_top_10">Add Response</button>
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
                                        <div class="form_group_row set_background_for_item">
                                            <label>Parking place</label>
                                            <div class="box_choice_itemList">
                                                <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/5_Security/ParkingArea.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Parking Area</span>
                                                                <div class="box_item_input">
                                                                    <input value="${secuity_requestedItemList[0].quantity}" name="5_ParkingArea" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>

                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>Security Officer</label>
                                            <div class="box_choice_itemList">
                                                <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/5_Security/SecurityOfficer.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Security guard</span>
                                                                <div class="box_item_input">
                                                                    <input value="${secuity_requestedItemList[1].quantity}" name="5_SecurityOfficer" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>

                                            </div>
                                        </div>
                                        <div class="form_group_row">
                                            <label>Description</label>
                                            <textarea name="5_description" class="form_control_textField">${formDepartment_secuity.description}</textarea>
                                        </div>
                                        <c:if test="${userProfile.responsible_form_type_id == 1}">
                                            <div class="form_footer_submit form_group_row">
                                            <a href="#event_imagesDescription_tab" onclick="SetNavBarActiveURL()" class="set_btn_confirm_md_backgroundWhite" type="submit">Next <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
                                            <button class="set_btn_confirm_md set_float_right" type="submit"><i class="fa fa-floppy-o" aria-hidden="true"></i> Save</button>
                                        </div> 
                                        </c:if>
                                    
                                </div>
                                <div class="col_percent_4 box_side_response_part_request">
                                    <div class="topic">
                                        Response
                                    </div>
                                    <div class="details">
                                        <div class="box_response_each_part_requestList">
                                            <c:forEach items="${responseMessageList_5}" var="responseMessage">
                                                <div class="box_response_each_part_request">
                                                    <div class="box_info_responder">
                                                        <span class="responder_icon"></span>
                                                        <div class="info_responder">
                                                            <span class="responder_name">${responseMessage.form_department_name}</span>
                                                            <span class="responder_dateTime">${responseMessage.updated_date}</span>
                                                        </div>
                                                    </div>
                                                    <div class="box_description_responder">
                                                        ${responseMessage.message}
                                                    </div>
                                                </div>
                                            </c:forEach>

                                        </div>
                                        <div class="box_add_response_description">
                                            <textarea class="form_control_textField"></textarea>
                                            <button class="set_btn_confirm_sm_backgroundWhite set_float_right set_margin_top_10">Add Response</button>
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
                              
                                        <div class="form_group_row set_background_for_item">
                                            <label>LCD Projector</label>
                                            <div class="box_choice_itemList">
                                                <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/6_IT/Projector01.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Projector</span>
                                                                <div class="box_item_input">
                                                                    <input value="${IT_requestedItemList[0].quantity}" name="6_Projector" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                                    
                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>Notebook</label>
                                            <div class="box_choice_itemList">
                                                 <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/6_IT/Laptop01.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Laptop</span>
                                                                <div class="box_item_input">
                                                                    <input value="${IT_requestedItemList[1].quantity}" name="6_Laptop" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>   

                                            </div>
                                        </div>

                                        <div class="form_group_row set_background_for_item">
                                            <label>Computer</label>
                                            <div class="box_choice_itemList">
                                                <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/6_IT/Computer01.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Computer</span>
                                                                <div class="box_item_input">
                                                                    <input value="${IT_requestedItemList[2].quantity}" name="6_Computer" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div> 

                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>Visualizer</label>
                                            <div class="box_choice_itemList">
                                               <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/6_IT/Visualizer.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Visualizer</span>
                                                                <div class="box_item_input">
                                                                    <input value="${IT_requestedItemList[3].quantity}" name="6_Visualizer" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>

                                            </div>
                                        </div>
                                        <div class="form_group_row set_background_for_item">
                                            <label>Screen</label>
                                            <div class="box_choice_itemList">
                                                <div class="box_each_item">
                                                            <div class="box_image_item">
                                                                 <img src="${pageContext.request.contextPath}/Images/6_IT/ProjectorScreen01.jpg" alt=""/>
                                                            </div>
                                                            <div class="box_info_item">
                                                                <span class="item_name">Projector Screen</span>
                                                                <div class="box_item_input">
                                                                    <input value="${IT_requestedItemList[4].quantity}" name="6_ProjectorScreen" class="input_item_quanlity form_control_textField" />
                                                                    <span class="item_unit">pcs.</span>
                                                                </div>
                                                            </div>
                                                        </div>

                                            </div>
                                        </div>
                                        <div class="form_group_row">
                                            <label>Description</label>
                                            <textarea name="6_description" class="form_control_textField">${formDepartment_IT.description}</textarea>
                                        </div>
                                        <c:if test="${userProfile.responsible_form_type_id == 1}">
                                            <div class="form_footer_submit form_group_row">
                                                <a href="#event_imagesDescription_tab" onclick="SetNavBarActiveURL()" class="set_btn_confirm_md_backgroundWhite" type="submit">Next <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
                                                <button class="set_btn_confirm_md set_float_right" type="submit"><i class="fa fa-floppy-o" aria-hidden="true"></i> Save</button>
                                            </div>
                                        </c:if>
                                       
                                  
                                </div>
                                <div class="col_percent_4 box_side_response_part_request">
                                    <div class="topic">
                                        Response
                                    </div>
                                    <div class="details">
                                        <div class="box_response_each_part_requestList">
                                            <c:forEach items="${responseMessageList_6}" var="responseMessage">
                                                <div class="box_response_each_part_request">
                                                    <div class="box_info_responder">
                                                        <span class="responder_icon"></span>
                                                        <div class="info_responder">
                                                            <span class="responder_name">${responseMessage.form_department_name}</span>
                                                            <span class="responder_dateTime">${responseMessage.updated_date}</span>
                                                        </div>
                                                    </div>
                                                    <div class="box_description_responder">
                                                        ${responseMessage.message}
                                                    </div>
                                                </div>
                                            </c:forEach>

                                        </div>
                                        <div class="box_add_response_description">
                                            <textarea class="form_control_textField"></textarea>
                                            <button class="set_btn_confirm_sm_backgroundWhite set_float_right set_margin_top_10">Add Response</button>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                            
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>