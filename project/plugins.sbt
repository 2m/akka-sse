addSbtPlugin("com.danieltrinh"  % "sbt-scalariform" % "1.3.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-git"         % "0.6.4")
addSbtPlugin("me.lessis"        % "bintray-sbt"     % "0.2.0")

resolvers += Resolver.url("bintraysbt-plugin-releases", url("http://dl.bintray.com/content/sbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)
