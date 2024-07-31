.class public final Lpb/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Lvb/j0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final c:Lvb/j0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpb/a;

    invoke-direct {v0}, Lpb/a;-><init>()V

    invoke-virtual {v0}, Lpb/a;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lpb/b;->a:Ljava/lang/String;

    invoke-static {}, Lvb/j0;->W()Lvb/j0;

    move-result-object v0

    sput-object v0, Lpb/b;->b:Lvb/j0;

    invoke-static {}, Lvb/j0;->W()Lvb/j0;

    move-result-object v0

    sput-object v0, Lpb/b;->c:Lvb/j0;

    :try_start_0
    invoke-static {}, Lpb/b;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a()V
    .locals 1

    invoke-static {}, Lpb/c;->e()V

    invoke-static {}, Lnb/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Lpb/a;->m(Z)V

    return-void
.end method
