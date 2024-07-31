.class public Ldi/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:Landroid/graphics/Bitmap$CompressFormat;

.field private d:I

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ldi/c;

.field private h:Landroid/net/Uri;

.field private i:Landroid/net/Uri;


# direct methods
.method public constructor <init>(IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;Ldi/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ldi/b;->a:I

    iput p2, p0, Ldi/b;->b:I

    iput-object p3, p0, Ldi/b;->c:Landroid/graphics/Bitmap$CompressFormat;

    iput p4, p0, Ldi/b;->d:I

    iput-object p5, p0, Ldi/b;->e:Ljava/lang/String;

    iput-object p6, p0, Ldi/b;->f:Ljava/lang/String;

    iput-object p7, p0, Ldi/b;->g:Ldi/c;

    return-void
.end method


# virtual methods
.method public a()Landroid/graphics/Bitmap$CompressFormat;
    .locals 1

    iget-object v0, p0, Ldi/b;->c:Landroid/graphics/Bitmap$CompressFormat;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Ldi/b;->d:I

    return v0
.end method

.method public c()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Ldi/b;->h:Landroid/net/Uri;

    return-object v0
.end method

.method public d()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Ldi/b;->i:Landroid/net/Uri;

    return-object v0
.end method

.method public e()Ldi/c;
    .locals 1

    iget-object v0, p0, Ldi/b;->g:Ldi/c;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ldi/b;->e:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ldi/b;->f:Ljava/lang/String;

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Ldi/b;->a:I

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Ldi/b;->b:I

    return v0
.end method

.method public j(Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Ldi/b;->h:Landroid/net/Uri;

    return-void
.end method

.method public k(Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Ldi/b;->i:Landroid/net/Uri;

    return-void
.end method
