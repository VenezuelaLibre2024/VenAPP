.class public Lgl/f;
.super Lzk/m1;
.source "SourceFile"


# instance fields
.field private final d:I

.field private final e:I

.field private final f:J

.field private final r:Ljava/lang/String;

.field private s:Lgl/a;


# direct methods
.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lzk/m1;-><init>()V

    iput p1, p0, Lgl/f;->d:I

    iput p2, p0, Lgl/f;->e:I

    iput-wide p3, p0, Lgl/f;->f:J

    iput-object p5, p0, Lgl/f;->r:Ljava/lang/String;

    invoke-direct {p0}, Lgl/f;->I0()Lgl/a;

    move-result-object p1

    iput-object p1, p0, Lgl/f;->s:Lgl/a;

    return-void
.end method

.method private final I0()Lgl/a;
    .locals 7

    new-instance v6, Lgl/a;

    iget v1, p0, Lgl/f;->d:I

    iget v2, p0, Lgl/f;->e:I

    iget-wide v3, p0, Lgl/f;->f:J

    iget-object v5, p0, Lgl/f;->r:Ljava/lang/String;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lgl/a;-><init>(IIJLjava/lang/String;)V

    return-object v6
.end method


# virtual methods
.method public D0(Lgk/f;Ljava/lang/Runnable;)V
    .locals 6

    iget-object v0, p0, Lgl/f;->s:Lgl/a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v1, p2

    invoke-static/range {v0 .. v5}, Lgl/a;->j(Lgl/a;Ljava/lang/Runnable;Lgl/i;ZILjava/lang/Object;)V

    return-void
.end method

.method public final J0(Ljava/lang/Runnable;Lgl/i;Z)V
    .locals 1

    iget-object v0, p0, Lgl/f;->s:Lgl/a;

    invoke-virtual {v0, p1, p2, p3}, Lgl/a;->i(Ljava/lang/Runnable;Lgl/i;Z)V

    return-void
.end method
