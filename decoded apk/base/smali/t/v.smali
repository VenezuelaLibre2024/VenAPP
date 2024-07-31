.class public Lt/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Z


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/t1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Ls/i0;

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/t1;->a(Ljava/lang/Class;)Z

    move-result p1

    iput-boolean p1, p0, Lt/v;->a:Z

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lt/v;->a:Z

    return v0
.end method
