.class Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arthenica/ffmpegkit/FFmpegKitConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/lang/Integer;

.field private final b:Landroid/net/Uri;

.field private final c:Ljava/lang/String;

.field private final d:Landroid/content/ContentResolver;

.field private e:Landroid/os/ParcelFileDescriptor;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Landroid/net/Uri;Ljava/lang/String;Landroid/content/ContentResolver;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;->a:Ljava/lang/Integer;

    iput-object p2, p0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;->b:Landroid/net/Uri;

    iput-object p3, p0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;->d:Landroid/content/ContentResolver;

    return-void
.end method


# virtual methods
.method public a()Landroid/content/ContentResolver;
    .locals 1

    iget-object v0, p0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;->d:Landroid/content/ContentResolver;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()Landroid/os/ParcelFileDescriptor;
    .locals 1

    iget-object v0, p0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;->e:Landroid/os/ParcelFileDescriptor;

    return-object v0
.end method

.method public d()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;->a:Ljava/lang/Integer;

    return-object v0
.end method

.method public e()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;->b:Landroid/net/Uri;

    return-object v0
.end method

.method public f(Landroid/os/ParcelFileDescriptor;)V
    .locals 0

    iput-object p1, p0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;->e:Landroid/os/ParcelFileDescriptor;

    return-void
.end method
