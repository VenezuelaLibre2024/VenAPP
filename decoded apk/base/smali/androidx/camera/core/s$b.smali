.class public final Landroidx/camera/core/s$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field private static final a:Lh0/c;

.field private static final b:Landroidx/camera/core/impl/r1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh0/c$a;

    invoke-direct {v0}, Lh0/c$a;-><init>()V

    sget-object v1, Lh0/a;->c:Lh0/a;

    invoke-virtual {v0, v1}, Lh0/c$a;->d(Lh0/a;)Lh0/c$a;

    move-result-object v0

    sget-object v1, Lh0/d;->c:Lh0/d;

    invoke-virtual {v0, v1}, Lh0/c$a;->e(Lh0/d;)Lh0/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lh0/c$a;->a()Lh0/c;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/s$b;->a:Lh0/c;

    new-instance v1, Landroidx/camera/core/s$a;

    invoke-direct {v1}, Landroidx/camera/core/s$a;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroidx/camera/core/s$a;->h(I)Landroidx/camera/core/s$a;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroidx/camera/core/s$a;->i(I)Landroidx/camera/core/s$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/camera/core/s$a;->g(Lh0/c;)Landroidx/camera/core/s$a;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/l2$b;->PREVIEW:Landroidx/camera/core/impl/l2$b;

    invoke-virtual {v0, v1}, Landroidx/camera/core/s$a;->f(Landroidx/camera/core/impl/l2$b;)Landroidx/camera/core/s$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/s$a;->e()Landroidx/camera/core/impl/r1;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/s$b;->b:Landroidx/camera/core/impl/r1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroidx/camera/core/impl/r1;
    .locals 1

    sget-object v0, Landroidx/camera/core/s$b;->b:Landroidx/camera/core/impl/r1;

    return-object v0
.end method
