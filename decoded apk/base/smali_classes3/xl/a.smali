.class public final Lxl/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxl/a$a;
    }
.end annotation


# static fields
.field public static final c:Lxl/a$a;


# instance fields
.field private final a:Ldm/d;

.field private b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxl/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxl/a$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lxl/a;->c:Lxl/a$a;

    return-void
.end method

.method public constructor <init>(Ldm/d;)V
    .locals 2

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxl/a;->a:Ldm/d;

    const-wide/32 v0, 0x40000

    iput-wide v0, p0, Lxl/a;->b:J

    return-void
.end method


# virtual methods
.method public final a()Lql/t;
    .locals 3

    new-instance v0, Lql/t$a;

    invoke-direct {v0}, Lql/t$a;-><init>()V

    :goto_0
    invoke-virtual {p0}, Lxl/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lql/t$a;->e()Lql/t;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {v0, v1}, Lql/t$a;->b(Ljava/lang/String;)Lql/t$a;

    goto :goto_0
.end method

.method public final b()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lxl/a;->a:Ldm/d;

    iget-wide v1, p0, Lxl/a;->b:J

    invoke-interface {v0, v1, v2}, Ldm/d;->L(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Lxl/a;->b:J

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr v1, v3

    iput-wide v1, p0, Lxl/a;->b:J

    return-object v0
.end method
