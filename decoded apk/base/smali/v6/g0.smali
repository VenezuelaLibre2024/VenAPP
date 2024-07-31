.class public final synthetic Lv6/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/media/AudioTrack;

.field public final synthetic b:Lt8/g;


# direct methods
.method public synthetic constructor <init>(Landroid/media/AudioTrack;Lt8/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv6/g0;->a:Landroid/media/AudioTrack;

    iput-object p2, p0, Lv6/g0;->b:Lt8/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv6/g0;->a:Landroid/media/AudioTrack;

    iget-object v1, p0, Lv6/g0;->b:Lt8/g;

    invoke-static {v0, v1}, Lv6/h0;->w(Landroid/media/AudioTrack;Lt8/g;)V

    return-void
.end method
