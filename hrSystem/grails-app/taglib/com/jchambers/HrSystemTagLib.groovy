package com.jchambers

class HrSystemTagLib {
    //static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

def loginToggle={

if (request.getSession(false) && session.user){

out <<"<span style='float:left;margin-left:15px'>"

out<<"Welcome${session.user}."

out <<"</span><span style='float:right;margin-right:15px'>"

out <<"<a href='${createLink(controller:'Manager',action:'logout')}'>"

out<<"Logout</a></span>"

}
else{
out <<"<span style='float:right;margin-right:10px'>"
out <<"<a href='${createLink(controller:'manager',action:'login')}'>"
out<<"Login</a></span>"
}
out<<"</div><br/>"
}
}

