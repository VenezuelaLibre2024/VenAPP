.class public final Landroidx/camera/core/n$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field private static final a:Lh0/c;

.field private static final b:Landroidx/camera/core/impl/d1;

.field private static final c:Lw/y;


# direct methods
.method static constructor <clinit>()V
    .locals 4

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

    sput-object v0, Landroidx/camera/core/n$c;->a:Lh0/c;

    sget-object v1, Lw/y;->d:Lw/y;

    sput-object v1, Landroidx/camera/core/n$c;->c:Lw/y;

    new-instance v2, Landroidx/camera/core/n$b;

    invoke-direct {v2}, Landroidx/camera/core/n$b;-><init>()V

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Landroidx/camera/core/n$b;->i(I)Landroidx/camera/core/n$b;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroidx/camera/core/n$b;->j(I)Landroidx/camera/core/n$b;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroidx/camera/core/n$b;->h(Lh0/c;)Landroidx/camera/core/n$b;

    move-result-object v0

    sget-object v2, Landroidx/camera/core/impl/l2$b;->IMAGE_CAPTURE:Landroidx/camera/core/impl/l2$b;

    invoke-virtual {v0, v2}, Landroidx/camera/core/n$b;->f(Landroidx/camera/core/impl/l2$b;)Landroidx/camera/core/n$b;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroidx/camera/core/n$b;->g(Lw/y;)Landroidx/camera/core/n$b;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/n$b;->e()Landroidx/camera/core/impl/d1;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/n$c;->b:Landroidx/camera/core/impl/d1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroidx/camera/core/impl/d1;
    .locals 1

    sget-object v0, Landroidx/camera/core/n$c;->b:Landroidx/camera/core/impl/d1;

    return-object v0
.end method
