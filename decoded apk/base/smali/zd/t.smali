.class public Lzd/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lzd/w0;

.field private final b:Lce/a;

.field private final c:Lzd/o3;

.field private final d:Lzd/m3;

.field private final e:Lzd/k;

.field private final f:Lde/m;

.field private final g:Lzd/q2;

.field private final h:Lzd/n;


# direct methods
.method public constructor <init>(Lzd/w0;Lce/a;Lzd/o3;Lzd/m3;Lzd/k;Lde/m;Lzd/q2;Lzd/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/t;->a:Lzd/w0;

    iput-object p2, p0, Lzd/t;->b:Lce/a;

    iput-object p3, p0, Lzd/t;->c:Lzd/o3;

    iput-object p4, p0, Lzd/t;->d:Lzd/m3;

    iput-object p5, p0, Lzd/t;->e:Lzd/k;

    iput-object p6, p0, Lzd/t;->f:Lde/m;

    iput-object p7, p0, Lzd/t;->g:Lzd/q2;

    iput-object p8, p0, Lzd/t;->h:Lzd/n;

    return-void
.end method


# virtual methods
.method public a(Lde/i;Ljava/lang/String;)Lqd/t;
    .locals 12

    new-instance v11, Lzd/h0;

    iget-object v1, p0, Lzd/t;->a:Lzd/w0;

    iget-object v2, p0, Lzd/t;->b:Lce/a;

    iget-object v3, p0, Lzd/t;->c:Lzd/o3;

    iget-object v4, p0, Lzd/t;->d:Lzd/m3;

    iget-object v5, p0, Lzd/t;->e:Lzd/k;

    iget-object v6, p0, Lzd/t;->f:Lde/m;

    iget-object v7, p0, Lzd/t;->g:Lzd/q2;

    iget-object v8, p0, Lzd/t;->h:Lzd/n;

    move-object v0, v11

    move-object v9, p1

    move-object v10, p2

    invoke-direct/range {v0 .. v10}, Lzd/h0;-><init>(Lzd/w0;Lce/a;Lzd/o3;Lzd/m3;Lzd/k;Lde/m;Lzd/q2;Lzd/n;Lde/i;Ljava/lang/String;)V

    return-object v11
.end method
