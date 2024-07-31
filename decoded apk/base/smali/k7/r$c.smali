.class final Lk7/r$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk7/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# static fields
.field public static final e:Lk7/r$c;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:Lt8/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/m0<",
            "Lt6/u1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v7, Lk7/r$c;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lk7/r$c;-><init>(JJJ)V

    sput-object v7, Lk7/r$c;->e:Lk7/r$c;

    return-void
.end method

.method public constructor <init>(JJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lk7/r$c;->a:J

    iput-wide p3, p0, Lk7/r$c;->b:J

    iput-wide p5, p0, Lk7/r$c;->c:J

    new-instance p1, Lt8/m0;

    invoke-direct {p1}, Lt8/m0;-><init>()V

    iput-object p1, p0, Lk7/r$c;->d:Lt8/m0;

    return-void
.end method
