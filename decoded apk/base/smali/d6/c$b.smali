.class Ld6/c$b;
.super La9/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/graphics/drawable/Drawable;

.field private b:Landroid/net/Uri;

.field final synthetic c:Ld6/c;


# direct methods
.method public constructor <init>(Ld6/c;)V
    .locals 0

    iput-object p1, p0, Ld6/c$b;->c:Ld6/c;

    invoke-direct {p0}, La9/d;-><init>()V

    return-void
.end method

.method public constructor <init>(Ld6/c;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Ld6/c$b;->c:Ld6/c;

    invoke-direct {p0}, La9/d;-><init>()V

    iput-object p2, p0, Ld6/c$b;->a:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public constructor <init>(Ld6/c;Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Ld6/c$b;->c:Ld6/c;

    invoke-direct {p0}, La9/d;-><init>()V

    iput-object p2, p0, Ld6/c$b;->b:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public getDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Ld6/c$b;->a:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getScale()D
    .locals 2

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    return-wide v0
.end method

.method public getUri()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Ld6/c$b;->b:Landroid/net/Uri;

    return-object v0
.end method
