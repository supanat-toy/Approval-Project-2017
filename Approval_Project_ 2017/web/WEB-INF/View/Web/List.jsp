
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="Models.*"%>
<c:set var="userProfile" value="${userProfile}" />
<c:set var="formDisplayList" value="${formDisplayList}" />
<c:set var="formTypeName" value="${userProfile.responsible_form_type_name}" />
<!--@{
page import="Models.*;"
    ViewBag.Title = "Index";
    Layout = "~/Views/Shared/_Layout_Member.cshtml";
}-->

<div class="set_background_screen_2 set_margin_container_default_10">
    <div class="box_layer_info_3">
        <div class="title">
            <div class="container_new">
                <span class="topic">Request for AU Service</span>
                <c:if test="${userProfile.responsible_form_type_id == 1}">
                    <a class="set_float_right set_btn_confirm_sm_backgroundWhite" href="${pageContext.request.contextPath}/${formTypeName}/Create">Create new request</a>
                </c:if>
            </div>
        </div>
        <div class="container_new">
            <div class="details">
                <div class="box_organinzer_event set_margin_container_default_10">
                    <div id="event_active" class="tab-pane fade in active">
                        <div class="session_student_requested">
                                <div class="box_requestList">
                                   
                                    <c:forEach items="${formDisplayList}" var="formDisplay">
                                        <%
                                            //FormModel formRequest = ((FormGroupModel)${request}).getFormList().get(0);
                                        %>
                                        <a href="${pageContext.request.contextPath}/${formTypeName}/Details?id=${formDisplay.form_id}" class="box_each_requested">
                                                <div class="box_info_top">
                                                    <div class="set_float_left">
                                                        <span class="event_name">${formDisplay.event_name}</span>
                                                        <span class="event_type">${formDisplay.activity}</span>
                                                        <span class="event_department"><i class="fa fa-university" aria-hidden="true"></i> ${result.basic_form.department}</span>
                                                        <span class="event_dateTime">
                                                            <i class="fa fa-calendar" aria-hidden="true"></i> ${formDisplay.starting_date}
                                                            <i class="set_margin_right_10"></i>
                                                            <i class="fa fa-clock-o" aria-hidden="true"></i> ${formDisplay.starting_date}
                                                        </span>
                                                    </div>
                                                    <div class="set_float_right">
                                                        <div class="box_status_instructor">
                                                            <!--
                                                            <c:if test="">
                                                                <span class="icon_status rejected">
                                                                    <i class="fa fa-times" aria-hidden="true"></i>
                                                                </span>
                                                            </c:if>
                                                            <c:if test="" >
                                                                <span class="icon_status approved">
                                                                    <i class="fa fa-check" aria-hidden="true"></i>
                                                                </span>
                                                            </c:if>
                                                            <c:if test="">
                                                                <span class="icon_status pending">
                                                                    <i class="fa fa-question" aria-hidden="true"></i>
                                                                </span>
                                                            </c:if>
                                                            -->
                                                            <span class="icon_status pending">
                                                                    <i class="fa fa-question" aria-hidden="true"></i>
                                                                </span>
                                                            <div class="box_instructor_info">
                                                                <span class="title">Responded by</span>
                                                                <span class="instructor_name">${formDisplay.latest_response}</span>
                                                            </div>
                                                        </div>
                                                    </div>

                                                </div>
                                                <div class="box_info_bottom">
                                                    <div class="set_float_left">
                                                        <div class="box_coordinator">
                                                            <i class="icon_coordinator fa fa-user-circle-o" aria-hidden="true"></i>
                                                            <div class="box_coordinator_info">
                                                                <span class="name">${formDisplay.coordinator_name}</span>
                                                                <span class="phone">${formDisplay.coordinator_phone_number}</span>
                                                            </div>  
                                                        </div>
                                                        <span>

                                                        </span>
                                                    </div>
                                                    <div class="set_float_right">
                                                        <ol class="progress progress--small">
                                                            <li class="is-complete">
                                                                <span class="title_progress_bar">Coordinator</span>
                                                            </li>
                                                            <li class="is-active">
                                                                <span class="title_progress_bar">Supervisor</span>
                                                            </li>
                                                            <li class="">
                                                                <span class="title_progress_bar">Administrative Director</span>
                                                            </li>
                                                            <li class="">
                                                                <span class="title_progress_bar">Department</span>
                                                            </li>
                                                            <li class="progress__last">
                                                                <span class="title_progress_bar">Done</span>
                                                            </li>
                                                        </ol>
                                                    </div>
                                                </div>
                                            </a>
                                    </c:forEach>                                    
                                </div>
                        </div>     
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>