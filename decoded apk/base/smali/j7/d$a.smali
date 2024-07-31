.class final Lj7/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj7/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final b:J


# direct methods
.method private constructor <init>(IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lj7/d$a;->a:I

    iput-wide p2, p0, Lj7/d$a;->b:J

    return-void
.end method

.method public static a(Ly6/l;Lt8/e0;)Lj7/d$a;
    .locals 3

    invoke-virtual {p1}, Lt8/e0;->e()[B

    move-result-object v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-interface {p0, v0, v2, v1}, Ly6/l;->q([BII)V

    invoke-virtual {p1, v2}, Lt8/e0;->U(I)V

    invoke-virtual {p1}, Lt8/e0;->q()I

    move-result p0

    invoke-virtual {p1}, Lt8/e0;->x()J

    move-result-wide v0

    new-instance p1, Lj7/d$a;

    invoke-direct {p1, p0, v0, v1}, Lj7/d$a;-><init>(IJ)V

    return-object p1
.end method
