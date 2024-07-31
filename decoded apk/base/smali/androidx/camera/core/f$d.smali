.class public final Landroidx/camera/core/f$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field private static final a:Landroid/util/Size;

.field private static final b:Lw/y;

.field private static final c:Lh0/c;

.field private static final d:Landroidx/camera/core/impl/c1;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Landroid/util/Size;

    const/16 v1, 0x280

    const/16 v2, 0x1e0

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    sput-object v0, Landroidx/camera/core/f$d;->a:Landroid/util/Size;

    sget-object v1, Lw/y;->d:Lw/y;

    sput-object v1, Landroidx/camera/core/f$d;->b:Lw/y;

    new-instance v2, Lh0/c$a;

    invoke-direct {v2}, Lh0/c$a;-><init>()V

    sget-object v3, Lh0/a;->c:Lh0/a;

    invoke-virtual {v2, v3}, Lh0/c$a;->d(Lh0/a;)Lh0/c$a;

    move-result-object v2

    new-instance v3, Lh0/d;

    sget-object v4, Lf0/d;->c:Landroid/util/Size;

    const/4 v5, 0x1

    invoke-direct {v3, v4, v5}, Lh0/d;-><init>(Landroid/util/Size;I)V

    invoke-virtual {v2, v3}, Lh0/c$a;->e(Lh0/d;)Lh0/c$a;

    move-result-object v2

    invoke-virtual {v2}, Lh0/c$a;->a()Lh0/c;

    move-result-object v2

    sput-object v2, Landroidx/camera/core/f$d;->c:Lh0/c;

    new-instance v3, Landroidx/camera/core/f$c;

    invoke-direct {v3}, Landroidx/camera/core/f$c;-><init>()V

    invoke-virtual {v3, v0}, Landroidx/camera/core/f$c;->h(Landroid/util/Size;)Landroidx/camera/core/f$c;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroidx/camera/core/f$c;->k(I)Landroidx/camera/core/f$c;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroidx/camera/core/f$c;->l(I)Landroidx/camera/core/f$c;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroidx/camera/core/f$c;->j(Lh0/c;)Landroidx/camera/core/f$c;

    move-result-object v0

    sget-object v2, Landroidx/camera/core/impl/l2$b;->IMAGE_ANALYSIS:Landroidx/camera/core/impl/l2$b;

    invoke-virtual {v0, v2}, Landroidx/camera/core/f$c;->g(Landroidx/camera/core/impl/l2$b;)Landroidx/camera/core/f$c;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroidx/camera/core/f$c;->i(Lw/y;)Landroidx/camera/core/f$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/f$c;->e()Landroidx/camera/core/impl/c1;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/f$d;->d:Landroidx/camera/core/impl/c1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroidx/camera/core/impl/c1;
    .locals 1

    sget-object v0, Landroidx/camera/core/f$d;->d:Landroidx/camera/core/impl/c1;

    return-object v0
.end method
