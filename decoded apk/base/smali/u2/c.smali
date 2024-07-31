.class public Lu2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt2/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Package;
    .locals 0

    invoke-static {p2}, Lt2/a;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Package;->getPackage(Ljava/lang/String;)Ljava/lang/Package;

    move-result-object p1

    return-object p1
.end method
