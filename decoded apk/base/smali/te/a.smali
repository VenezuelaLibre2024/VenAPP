.class public Lte/a;
.super Lte/e;
.source "SourceFile"


# static fields
.field private static final b:Lre/a;


# instance fields
.field private final a:Lxe/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lre/a;->e()Lre/a;

    move-result-object v0

    sput-object v0, Lte/a;->b:Lre/a;

    return-void
.end method

.method constructor <init>(Lxe/c;)V
    .locals 0

    invoke-direct {p0}, Lte/e;-><init>()V

    iput-object p1, p0, Lte/a;->a:Lxe/c;

    return-void
.end method

.method private g()Z
    .locals 3

    iget-object v0, p0, Lte/a;->a:Lxe/c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-object v0, Lte/a;->b:Lre/a;

    const-string v2, "ApplicationInfo is null"

    :goto_0
    invoke-virtual {v0, v2}, Lre/a;->j(Ljava/lang/String;)V

    return v1

    :cond_0
    invoke-virtual {v0}, Lxe/c;->n0()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lte/a;->b:Lre/a;

    const-string v2, "GoogleAppId is null"

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lte/a;->a:Lxe/c;

    invoke-virtual {v0}, Lxe/c;->l0()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lte/a;->b:Lre/a;

    const-string v2, "AppInstanceId is null"

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lte/a;->a:Lxe/c;

    invoke-virtual {v0}, Lxe/c;->m0()Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lte/a;->b:Lre/a;

    const-string v2, "ApplicationProcessState is null"

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lte/a;->a:Lxe/c;

    invoke-virtual {v0}, Lxe/c;->k0()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lte/a;->a:Lxe/c;

    invoke-virtual {v0}, Lxe/c;->h0()Lxe/a;

    move-result-object v0

    invoke-virtual {v0}, Lxe/a;->g0()Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lte/a;->b:Lre/a;

    const-string v2, "AndroidAppInfo.packageName is null"

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lte/a;->a:Lxe/c;

    invoke-virtual {v0}, Lxe/c;->h0()Lxe/a;

    move-result-object v0

    invoke-virtual {v0}, Lxe/a;->h0()Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Lte/a;->b:Lre/a;

    const-string v2, "AndroidAppInfo.sdkVersion is null"

    goto :goto_0

    :cond_5
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public c()Z
    .locals 2

    invoke-direct {p0}, Lte/a;->g()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lte/a;->b:Lre/a;

    const-string v1, "ApplicationInfo is invalid"

    invoke-virtual {v0, v1}, Lre/a;->j(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
