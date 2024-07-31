.class public final synthetic Lk7/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaCodec$OnFrameRenderedListener;


# instance fields
.field public final synthetic a:Lk7/e0;

.field public final synthetic b:Lk7/l$c;


# direct methods
.method public synthetic constructor <init>(Lk7/e0;Lk7/l$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk7/d0;->a:Lk7/e0;

    iput-object p2, p0, Lk7/d0;->b:Lk7/l$c;

    return-void
.end method


# virtual methods
.method public final onFrameRendered(Landroid/media/MediaCodec;JJ)V
    .locals 7

    iget-object v0, p0, Lk7/d0;->a:Lk7/e0;

    iget-object v1, p0, Lk7/d0;->b:Lk7/l$c;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-static/range {v0 .. v6}, Lk7/e0;->o(Lk7/e0;Lk7/l$c;Landroid/media/MediaCodec;JJ)V

    return-void
.end method
