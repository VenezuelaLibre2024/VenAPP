.class public final Landroidx/camera/core/impl/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/l0$a;,
        Landroidx/camera/core/impl/l0$b;
    }
.end annotation


# static fields
.field public static final i:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final j:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/r0;",
            ">;"
        }
    .end annotation
.end field

.field final b:Landroidx/camera/core/impl/n0;

.field final c:I

.field final d:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/k;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Z

.field private final g:Landroidx/camera/core/impl/f2;

.field private final h:Landroidx/camera/core/impl/s;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "camerax.core.captureConfig.rotation"

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/l0;->i:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.captureConfig.jpegQuality"

    const-class v1, Ljava/lang/Integer;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/l0;->j:Landroidx/camera/core/impl/n0$a;

    return-void
.end method

.method constructor <init>(Ljava/util/List;Landroidx/camera/core/impl/n0;ILandroid/util/Range;Ljava/util/List;ZLandroidx/camera/core/impl/f2;Landroidx/camera/core/impl/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/r0;",
            ">;",
            "Landroidx/camera/core/impl/n0;",
            "I",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/k;",
            ">;Z",
            "Landroidx/camera/core/impl/f2;",
            "Landroidx/camera/core/impl/s;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/impl/l0;->a:Ljava/util/List;

    iput-object p2, p0, Landroidx/camera/core/impl/l0;->b:Landroidx/camera/core/impl/n0;

    iput p3, p0, Landroidx/camera/core/impl/l0;->c:I

    iput-object p4, p0, Landroidx/camera/core/impl/l0;->d:Landroid/util/Range;

    invoke-static {p5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/impl/l0;->e:Ljava/util/List;

    iput-boolean p6, p0, Landroidx/camera/core/impl/l0;->f:Z

    iput-object p7, p0, Landroidx/camera/core/impl/l0;->g:Landroidx/camera/core/impl/f2;

    iput-object p8, p0, Landroidx/camera/core/impl/l0;->h:Landroidx/camera/core/impl/s;

    return-void
.end method

.method public static a()Landroidx/camera/core/impl/l0;
    .locals 1

    new-instance v0, Landroidx/camera/core/impl/l0$a;

    invoke-direct {v0}, Landroidx/camera/core/impl/l0$a;-><init>()V

    invoke-virtual {v0}, Landroidx/camera/core/impl/l0$a;->h()Landroidx/camera/core/impl/l0;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/k;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/l0;->e:Ljava/util/List;

    return-object v0
.end method

.method public c()Landroidx/camera/core/impl/s;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/l0;->h:Landroidx/camera/core/impl/s;

    return-object v0
.end method

.method public d()Landroid/util/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/l0;->d:Landroid/util/Range;

    return-object v0
.end method

.method public e()Landroidx/camera/core/impl/n0;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/l0;->b:Landroidx/camera/core/impl/n0;

    return-object v0
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/r0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/l0;->a:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public g()Landroidx/camera/core/impl/f2;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/l0;->g:Landroidx/camera/core/impl/f2;

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Landroidx/camera/core/impl/l0;->c:I

    return v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/camera/core/impl/l0;->f:Z

    return v0
.end method
