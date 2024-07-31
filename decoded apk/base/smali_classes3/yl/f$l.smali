.class public final Lyl/f$l;
.super Lul/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyl/f;->D1(IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Z

.field final synthetic g:Lyl/f;

.field final synthetic h:I

.field final synthetic i:J


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLyl/f;IJ)V
    .locals 0

    iput-object p1, p0, Lyl/f$l;->e:Ljava/lang/String;

    iput-boolean p2, p0, Lyl/f$l;->f:Z

    iput-object p3, p0, Lyl/f$l;->g:Lyl/f;

    iput p4, p0, Lyl/f$l;->h:I

    iput-wide p5, p0, Lyl/f$l;->i:J

    invoke-direct {p0, p1, p2}, Lul/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 4

    :try_start_0
    iget-object v0, p0, Lyl/f$l;->g:Lyl/f;

    invoke-virtual {v0}, Lyl/f;->F0()Lyl/j;

    move-result-object v0

    iget v1, p0, Lyl/f$l;->h:I

    iget-wide v2, p0, Lyl/f$l;->i:J

    invoke-virtual {v0, v1, v2, v3}, Lyl/j;->d(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lyl/f$l;->g:Lyl/f;

    invoke-static {v1, v0}, Lyl/f;->a(Lyl/f;Ljava/io/IOException;)V

    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method
