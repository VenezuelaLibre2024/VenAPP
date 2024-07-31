.class public final Lwi/g;
.super Lvi/u0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lvi/u0;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/String;)Lvi/t0;
    .locals 0

    invoke-virtual {p0, p1}, Lwi/g;->e(Ljava/lang/String;)Lwi/f;

    move-result-object p1

    return-object p1
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public c()I
    .locals 1

    const-class v0, Lwi/g;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0}, Lvi/l0;->a(Ljava/lang/ClassLoader;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x8

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    :goto_0
    return v0
.end method

.method public e(Ljava/lang/String;)Lwi/f;
    .locals 0

    invoke-static {p1}, Lwi/f;->f(Ljava/lang/String;)Lwi/f;

    move-result-object p1

    return-object p1
.end method
