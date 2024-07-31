.class Lf8/b$e;
.super Lf8/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# instance fields
.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lf8/a$b;",
            ">;"
        }
    .end annotation
.end field

.field private f:I

.field private g:I

.field private h:J

.field private i:J

.field private j:J

.field private k:I

.field private l:Z

.field private m:Lf8/a$a;


# direct methods
.method public constructor <init>(Lf8/b$a;Ljava/lang/String;)V
    .locals 1

    const-string v0, "SmoothStreamingMedia"

    invoke-direct {p0, p1, p2, v0}, Lf8/b$a;-><init>(Lf8/b$a;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, -0x1

    iput p1, p0, Lf8/b$e;->k:I

    const/4 p1, 0x0

    iput-object p1, p0, Lf8/b$e;->m:Lf8/a$a;

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lf8/b$e;->e:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p1, Lf8/a$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf8/b$e;->e:Ljava/util/List;

    check-cast p1, Lf8/a$b;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lf8/a$a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lf8/b$e;->m:Lf8/a$a;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lt8/a;->g(Z)V

    check-cast p1, Lf8/a$a;

    iput-object p1, p0, Lf8/b$e;->m:Lf8/a$a;

    :cond_2
    :goto_1
    return-void
.end method

.method public b()Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lf8/b$e;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v13, v0, [Lf8/a$b;

    iget-object v1, p0, Lf8/b$e;->e:Ljava/util/List;

    invoke-interface {v1, v13}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    iget-object v1, p0, Lf8/b$e;->m:Lf8/a$a;

    if-eqz v1, :cond_2

    new-instance v1, Lx6/m;

    const/4 v2, 0x1

    new-array v3, v2, [Lx6/m$b;

    new-instance v4, Lx6/m$b;

    iget-object v5, p0, Lf8/b$e;->m:Lf8/a$a;

    iget-object v6, v5, Lf8/a$a;->a:Ljava/util/UUID;

    const-string v7, "video/mp4"

    iget-object v5, v5, Lf8/a$a;->b:[B

    invoke-direct {v4, v6, v7, v5}, Lx6/m$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-direct {v1, v3}, Lx6/m;-><init>([Lx6/m$b;)V

    move v3, v5

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v4, v13, v3

    iget v6, v4, Lf8/a$b;->a:I

    const/4 v7, 0x2

    if-eq v6, v7, :cond_0

    if-ne v6, v2, :cond_1

    :cond_0
    iget-object v4, v4, Lf8/a$b;->j:[Lt6/u1;

    move v6, v5

    :goto_1
    array-length v7, v4

    if-ge v6, v7, :cond_1

    aget-object v7, v4, v6

    invoke-virtual {v7}, Lt6/u1;->c()Lt6/u1$b;

    move-result-object v7

    invoke-virtual {v7, v1}, Lt6/u1$b;->O(Lx6/m;)Lt6/u1$b;

    move-result-object v7

    invoke-virtual {v7}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object v7

    aput-object v7, v4, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    new-instance v0, Lf8/a;

    iget v2, p0, Lf8/b$e;->f:I

    iget v3, p0, Lf8/b$e;->g:I

    iget-wide v4, p0, Lf8/b$e;->h:J

    iget-wide v6, p0, Lf8/b$e;->i:J

    iget-wide v8, p0, Lf8/b$e;->j:J

    iget v10, p0, Lf8/b$e;->k:I

    iget-boolean v11, p0, Lf8/b$e;->l:Z

    iget-object v12, p0, Lf8/b$e;->m:Lf8/a$a;

    move-object v1, v0

    invoke-direct/range {v1 .. v13}, Lf8/a;-><init>(IIJJJIZLf8/a$a;[Lf8/a$b;)V

    return-object v0
.end method

.method public n(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 5

    const-string v0, "MajorVersion"

    invoke-virtual {p0, p1, v0}, Lf8/b$a;->k(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lf8/b$e;->f:I

    const-string v0, "MinorVersion"

    invoke-virtual {p0, p1, v0}, Lf8/b$a;->k(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lf8/b$e;->g:I

    const-wide/32 v0, 0x989680

    const-string v2, "TimeScale"

    invoke-virtual {p0, p1, v2, v0, v1}, Lf8/b$a;->j(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lf8/b$e;->h:J

    const-string v0, "Duration"

    invoke-virtual {p0, p1, v0}, Lf8/b$a;->l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lf8/b$e;->i:J

    const-string v0, "DVRWindowLength"

    const-wide/16 v3, 0x0

    invoke-virtual {p0, p1, v0, v3, v4}, Lf8/b$a;->j(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lf8/b$e;->j:J

    const-string v0, "LookaheadCount"

    const/4 v1, -0x1

    invoke-virtual {p0, p1, v0, v1}, Lf8/b$a;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lf8/b$e;->k:I

    const-string v0, "IsLive"

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lf8/b$a;->g(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lf8/b$e;->l:Z

    iget-wide v0, p0, Lf8/b$e;->h:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, v2, p1}, Lf8/b$a;->p(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
