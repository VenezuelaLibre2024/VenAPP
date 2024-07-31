.class public final Lkb/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;

.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/lang/String;

.field public static final e:Ljava/lang/String;

.field public static final f:Ljava/lang/String;

.field public static final g:Ljava/lang/String;

.field public static final h:Ljava/lang/String;

.field public static final i:Lvb/j0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final j:Lvb/j0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final k:Lvb/j0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkb/e;

    invoke-direct {v0}, Lkb/e;-><init>()V

    invoke-virtual {v0}, Lkb/e;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkb/a;->a:Ljava/lang/String;

    new-instance v0, Lkb/p;

    invoke-direct {v0}, Lkb/p;-><init>()V

    invoke-virtual {v0}, Lkb/p;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkb/a;->b:Ljava/lang/String;

    new-instance v0, Lkb/u;

    invoke-direct {v0}, Lkb/u;-><init>()V

    invoke-virtual {v0}, Lkb/u;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkb/a;->c:Ljava/lang/String;

    new-instance v0, Lkb/h;

    invoke-direct {v0}, Lkb/h;-><init>()V

    invoke-virtual {v0}, Lkb/h;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkb/a;->d:Ljava/lang/String;

    new-instance v0, Lkb/d0;

    invoke-direct {v0}, Lkb/d0;-><init>()V

    invoke-virtual {v0}, Lkb/d0;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkb/a;->e:Ljava/lang/String;

    new-instance v0, Lkb/f0;

    invoke-direct {v0}, Lkb/f0;-><init>()V

    invoke-virtual {v0}, Lkb/f0;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkb/a;->f:Ljava/lang/String;

    new-instance v0, Lkb/z;

    invoke-direct {v0}, Lkb/z;-><init>()V

    invoke-virtual {v0}, Lkb/z;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkb/a;->g:Ljava/lang/String;

    new-instance v0, Lkb/h0;

    invoke-direct {v0}, Lkb/h0;-><init>()V

    invoke-virtual {v0}, Lkb/h0;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkb/a;->h:Ljava/lang/String;

    invoke-static {}, Lvb/j0;->W()Lvb/j0;

    move-result-object v0

    sput-object v0, Lkb/a;->i:Lvb/j0;

    sput-object v0, Lkb/a;->j:Lvb/j0;

    sput-object v0, Lkb/a;->k:Lvb/j0;

    :try_start_0
    invoke-static {}, Lkb/a;->a()V
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

    invoke-static {}, Lkb/a;->b()V

    return-void
.end method

.method public static b()V
    .locals 2

    invoke-static {}, Lkb/d;->e()V

    invoke-static {}, Lrb/o;->b()V

    const/4 v0, 0x1

    invoke-static {v0}, Lkb/e;->p(Z)V

    invoke-static {v0}, Lkb/p;->o(Z)V

    invoke-static {}, Lnb/a;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lkb/h;->o(Z)V

    invoke-static {v0}, Lkb/u;->p(Z)V

    invoke-static {v0}, Lkb/z;->m(Z)V

    invoke-static {v0}, Lkb/d0;->m(Z)V

    invoke-static {v0}, Lkb/f0;->m(Z)V

    invoke-static {v0}, Lkb/h0;->m(Z)V

    return-void
.end method
