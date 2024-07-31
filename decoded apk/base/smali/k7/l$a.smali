.class public final Lk7/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk7/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lk7/p;

.field public final b:Landroid/media/MediaFormat;

.field public final c:Lt6/u1;

.field public final d:Landroid/view/Surface;

.field public final e:Landroid/media/MediaCrypto;

.field public final f:I


# direct methods
.method private constructor <init>(Lk7/p;Landroid/media/MediaFormat;Lt6/u1;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk7/l$a;->a:Lk7/p;

    iput-object p2, p0, Lk7/l$a;->b:Landroid/media/MediaFormat;

    iput-object p3, p0, Lk7/l$a;->c:Lt6/u1;

    iput-object p4, p0, Lk7/l$a;->d:Landroid/view/Surface;

    iput-object p5, p0, Lk7/l$a;->e:Landroid/media/MediaCrypto;

    iput p6, p0, Lk7/l$a;->f:I

    return-void
.end method

.method public static a(Lk7/p;Landroid/media/MediaFormat;Lt6/u1;Landroid/media/MediaCrypto;)Lk7/l$a;
    .locals 8

    new-instance v7, Lk7/l$a;

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v6}, Lk7/l$a;-><init>(Lk7/p;Landroid/media/MediaFormat;Lt6/u1;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    return-object v7
.end method

.method public static b(Lk7/p;Landroid/media/MediaFormat;Lt6/u1;Landroid/view/Surface;Landroid/media/MediaCrypto;)Lk7/l$a;
    .locals 8

    new-instance v7, Lk7/l$a;

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lk7/l$a;-><init>(Lk7/p;Landroid/media/MediaFormat;Lt6/u1;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    return-object v7
.end method
