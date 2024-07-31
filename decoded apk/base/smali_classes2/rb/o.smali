.class public final Lrb/o;
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

.field public static final d:Lvb/j0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrb/k;

    invoke-direct {v0}, Lrb/k;-><init>()V

    invoke-virtual {v0}, Lrb/k;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lrb/o;->a:Ljava/lang/String;

    invoke-static {}, Lvb/j0;->W()Lvb/j0;

    move-result-object v0

    sput-object v0, Lrb/o;->b:Lvb/j0;

    sput-object v0, Lrb/o;->c:Lvb/j0;

    sput-object v0, Lrb/o;->d:Lvb/j0;

    :try_start_0
    invoke-static {}, Lrb/o;->a()V
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
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lrb/o;->b()V

    return-void
.end method

.method public static b()V
    .locals 2

    invoke-static {}, Lrb/r;->f()V

    invoke-static {}, Lrb/h;->d()V

    const/4 v0, 0x1

    invoke-static {v0}, Lrb/k;->p(Z)V

    invoke-static {}, Lnb/a;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lrb/c;->o(Z)V

    return-void
.end method
