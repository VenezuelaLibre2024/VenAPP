.class final Lh8/e$b;
.super Lg8/n;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh8/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lg8/n;",
        "Ljava/lang/Comparable<",
        "Lh8/e$b;",
        ">;"
    }
.end annotation


# instance fields
.field private u:J


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lg8/n;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lh8/e$a;)V
    .locals 0

    invoke-direct {p0}, Lh8/e$b;-><init>()V

    return-void
.end method

.method static synthetic D(Lh8/e$b;J)J
    .locals 0

    iput-wide p1, p0, Lh8/e$b;->u:J

    return-wide p1
.end method


# virtual methods
.method public E(Lh8/e$b;)I
    .locals 8

    invoke-virtual {p0}, Lw6/a;->s()Z

    move-result v0

    invoke-virtual {p1}, Lw6/a;->s()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lw6/a;->s()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    return v2

    :cond_1
    iget-wide v0, p0, Lw6/g;->e:J

    iget-wide v4, p1, Lw6/g;->e:J

    sub-long/2addr v0, v4

    const-wide/16 v4, 0x0

    cmp-long v6, v0, v4

    if-nez v6, :cond_2

    iget-wide v0, p0, Lh8/e$b;->u:J

    iget-wide v6, p1, Lh8/e$b;->u:J

    sub-long/2addr v0, v6

    cmp-long p1, v0, v4

    if-nez p1, :cond_2

    const/4 p1, 0x0

    return p1

    :cond_2
    cmp-long p1, v0, v4

    if-lez p1, :cond_3

    goto :goto_1

    :cond_3
    move v2, v3

    :goto_1
    return v2
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lh8/e$b;

    invoke-virtual {p0, p1}, Lh8/e$b;->E(Lh8/e$b;)I

    move-result p1

    return p1
.end method
