.class public Lbe/w;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lvi/d;
    .locals 0

    invoke-static {p1}, Lvi/t0;->b(Ljava/lang/String;)Lvi/t0;

    move-result-object p1

    invoke-virtual {p1}, Lvi/t0;->a()Lvi/s0;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "firebaseinappmessaging.googleapis.com"

    return-object v0
.end method
