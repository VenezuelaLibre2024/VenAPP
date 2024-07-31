.class public final Lcom/google/android/exoplayer2/source/hls/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lb8/f;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final b:Lb8/h;

.field public final c:Lb8/g;


# direct methods
.method constructor <init>(Lb8/h;Lb8/g;)V
    .locals 13

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/a;->b:Lb8/h;

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/a;->c:Lb8/g;

    new-instance p2, Lb8/f;

    iget-object v1, p1, Lb8/i;->a:Ljava/lang/String;

    iget-object v2, p1, Lb8/i;->b:Ljava/util/List;

    iget-object v3, p1, Lb8/h;->e:Ljava/util/List;

    iget-object v4, p1, Lb8/h;->f:Ljava/util/List;

    iget-object v5, p1, Lb8/h;->g:Ljava/util/List;

    iget-object v6, p1, Lb8/h;->h:Ljava/util/List;

    iget-object v7, p1, Lb8/h;->i:Ljava/util/List;

    iget-object v8, p1, Lb8/h;->j:Lt6/u1;

    iget-object v9, p1, Lb8/h;->k:Ljava/util/List;

    iget-boolean v10, p1, Lb8/i;->c:Z

    iget-object v11, p1, Lb8/h;->l:Ljava/util/Map;

    iget-object v12, p1, Lb8/h;->m:Ljava/util/List;

    move-object v0, p2

    invoke-direct/range {v0 .. v12}, Lb8/f;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt6/u1;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;)V

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/a;->a:Lb8/f;

    return-void
.end method
