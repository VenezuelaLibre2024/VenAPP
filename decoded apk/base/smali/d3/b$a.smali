.class public Ld3/b$a;
.super Ldm/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "a"
.end annotation


# instance fields
.field private b:J

.field private final c:Ld3/b;


# direct methods
.method public constructor <init>(Ld3/b;Ldm/v;)V
    .locals 0

    invoke-direct {p0, p2}, Ldm/f;-><init>(Ldm/v;)V

    iput-object p1, p0, Ld3/b$a;->c:Ld3/b;

    return-void
.end method


# virtual methods
.method public K0(Ldm/b;J)V
    .locals 2

    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ldm/f;->K0(Ldm/b;J)V

    iget-wide v0, p0, Ld3/b$a;->b:J

    add-long/2addr v0, p2

    iput-wide v0, p0, Ld3/b$a;->b:J

    iget-object p1, p0, Ld3/b$a;->c:Ld3/b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ld3/b;->a()J

    move-result-wide p2

    invoke-virtual {p1, v0, v1, p2, p3}, Ld3/b;->h(JJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Ld3/b$a;->c:Ld3/b;

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Ld3/b;->g(Ljava/lang/Exception;)V

    :cond_0
    :goto_0
    return-void
.end method
