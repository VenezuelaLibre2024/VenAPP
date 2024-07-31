.class public Lt/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ls/e0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Ls/e0;

    invoke-static {v0}, Ls/l;->a(Ljava/lang/Class;)Landroidx/camera/core/impl/s1;

    move-result-object v0

    check-cast v0, Ls/e0;

    iput-object v0, p0, Lt/d;->a:Ls/e0;

    return-void
.end method


# virtual methods
.method public a()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Lt/d;->a:Ls/e0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ls/e0;->a()Landroid/util/Size;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
