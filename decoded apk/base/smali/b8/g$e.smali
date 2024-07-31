.class public Lb8/g$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lb8/g$d;

.field public final c:J

.field public final d:I

.field public final e:J

.field public final f:Lx6/m;

.field public final r:Ljava/lang/String;

.field public final s:Ljava/lang/String;

.field public final t:J

.field public final u:J

.field public final v:Z


# direct methods
.method private constructor <init>(Ljava/lang/String;Lb8/g$d;JIJLx6/m;Ljava/lang/String;Ljava/lang/String;JJZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb8/g$e;->a:Ljava/lang/String;

    iput-object p2, p0, Lb8/g$e;->b:Lb8/g$d;

    iput-wide p3, p0, Lb8/g$e;->c:J

    iput p5, p0, Lb8/g$e;->d:I

    iput-wide p6, p0, Lb8/g$e;->e:J

    iput-object p8, p0, Lb8/g$e;->f:Lx6/m;

    iput-object p9, p0, Lb8/g$e;->r:Ljava/lang/String;

    iput-object p10, p0, Lb8/g$e;->s:Ljava/lang/String;

    iput-wide p11, p0, Lb8/g$e;->t:J

    iput-wide p13, p0, Lb8/g$e;->u:J

    iput-boolean p15, p0, Lb8/g$e;->v:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lb8/g$d;JIJLx6/m;Ljava/lang/String;Ljava/lang/String;JJZLb8/g$a;)V
    .locals 0

    invoke-direct/range {p0 .. p15}, Lb8/g$e;-><init>(Ljava/lang/String;Lb8/g$d;JIJLx6/m;Ljava/lang/String;Ljava/lang/String;JJZ)V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Long;)I
    .locals 4

    iget-wide v0, p0, Lb8/g$e;->e:J

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lb8/g$e;->e:J

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-gez p1, :cond_1

    const/4 p1, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lb8/g$e;->b(Ljava/lang/Long;)I

    move-result p1

    return p1
.end method
