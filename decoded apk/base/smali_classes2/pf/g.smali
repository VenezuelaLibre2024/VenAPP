.class public final Lpf/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpf/g$b;
    }
.end annotation


# static fields
.field private static volatile a:Lvi/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/x0<",
            "Lpf/d;",
            "Lpf/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lvi/x0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvi/x0<",
            "Lpf/d;",
            "Lpf/e;",
            ">;"
        }
    .end annotation

    sget-object v0, Lpf/g;->a:Lvi/x0;

    if-nez v0, :cond_1

    const-class v1, Lpf/g;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lpf/g;->a:Lvi/x0;

    if-nez v0, :cond_0

    invoke-static {}, Lvi/x0;->g()Lvi/x0$b;

    move-result-object v0

    sget-object v2, Lvi/x0$d;->UNARY:Lvi/x0$d;

    invoke-virtual {v0, v2}, Lvi/x0$b;->f(Lvi/x0$d;)Lvi/x0$b;

    move-result-object v0

    const-string v2, "google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServing"

    const-string v3, "FetchEligibleCampaigns"

    invoke-static {v2, v3}, Lvi/x0;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lvi/x0$b;->b(Ljava/lang/String;)Lvi/x0$b;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lvi/x0$b;->e(Z)Lvi/x0$b;

    move-result-object v0

    invoke-static {}, Lpf/d;->i0()Lpf/d;

    move-result-object v2

    invoke-static {v2}, Lzi/b;->b(Lcom/google/protobuf/r0;)Lvi/x0$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Lvi/x0$b;->c(Lvi/x0$c;)Lvi/x0$b;

    move-result-object v0

    invoke-static {}, Lpf/e;->d0()Lpf/e;

    move-result-object v2

    invoke-static {v2}, Lzi/b;->b(Lcom/google/protobuf/r0;)Lvi/x0$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Lvi/x0$b;->d(Lvi/x0$c;)Lvi/x0$b;

    move-result-object v0

    invoke-virtual {v0}, Lvi/x0$b;->a()Lvi/x0;

    move-result-object v0

    sput-object v0, Lpf/g;->a:Lvi/x0;

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static b(Lvi/d;)Lpf/g$b;
    .locals 1

    new-instance v0, Lpf/g$a;

    invoke-direct {v0}, Lpf/g$a;-><init>()V

    invoke-static {v0, p0}, Laj/a;->e(Laj/b$a;Lvi/d;)Laj/b;

    move-result-object p0

    check-cast p0, Lpf/g$b;

    return-object p0
.end method
