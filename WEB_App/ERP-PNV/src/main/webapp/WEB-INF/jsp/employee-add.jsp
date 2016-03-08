<%@ include file="./header.jsp" %>


<h1>Add New Department</h1>

<div align="center">
    
    <table border="0" width="90%">
        <form:form action="add" modelAttribute="employeeForm" method="POST" >
            <form:hidden path="id" />
            <tr>
                <td align="left" width="20%">Name: </td>
                <td align="left" width="40%"><form:input path="empName" size="30"/></td>
                <td align="left"><form:errors path="empName" cssClass="error"/></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><form:input path="address" size="30"/></td>
                <td><form:errors path="address" cssClass="error"/></td>
            </tr>
           <tr>
                <td>Department :  </td>
                <td><form:select path="departments.id">
            		<form:option value="" label="--Please Select"/>
            		<form:options items="${departments_lst}" itemValue="id" itemLabel="depName"/>
        		</form:select></td>
                <td><form:errors path="departments.id" cssClass="error"/></td>
            </tr>
            
            <tr>
                <td>Title :  </td>
                <td><form:select path="titles.id">
            		<form:option value="" label="--Please Select"/>
            		<form:options items="${titles_lst}" itemValue="id" itemLabel="titleName"/>
        		</form:select></td>
                <td><form:errors path="titles.id" cssClass="error"/></td>
            </tr>

                    <tr>
                        <td><a href="<%=request.getContextPath()%>/employee" class="button">Back</a></td>
                        <td align="center"><input type="submit" value="submit"/></td>
                        <td></td>
                    </tr>
                    </form:form>
                </table>
            </div>









<%@ include file="./footer.jsp" %>