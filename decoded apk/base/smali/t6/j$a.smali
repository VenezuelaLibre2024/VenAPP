.class Lt6/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/os/Handler;

.field final synthetic b:Lt6/j;


# direct methods
.method public constructor <init>(Lt6/j;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lt6/j$a;->b:Lt6/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lt6/j$a;->a:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic a(Lt6/j$a;I)V
    .locals 0

    invoke-direct {p0, p1}, Lt6/j$a;->b(I)V

    return-void
.end method

.method private synthetic b(I)V
    .locals 1

    iget-object v0, p0, Lt6/j$a;->b:Lt6/j;

    invoke-static {v0, p1}, Lt6/j;->d(Lt6/j;I)V

    return-void
.end method


# virtual methods
.method public onAudioFocusChange(I)V
    .locals 2

    iget-object v0, p0, Lt6/j$a;->a:Landroid/os/Handler;

    new-instance v1, Lt6/i;

    invoke-direct {v1, p0, p1}, Lt6/i;-><init>(Lt6/j$a;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
