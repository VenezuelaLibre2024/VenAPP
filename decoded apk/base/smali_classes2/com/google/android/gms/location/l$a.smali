.class public final Lcom/google/android/gms/location/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/location/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:J

.field private b:I

.field private c:Z

.field private d:Ljava/lang/String;

.field private e:Lcom/google/android/gms/internal/location/zzd;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lcom/google/android/gms/location/l$a;->a:J

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/location/l$a;->b:I

    iput-boolean v0, p0, Lcom/google/android/gms/location/l$a;->c:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/location/l$a;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/location/l$a;->e:Lcom/google/android/gms/internal/location/zzd;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/location/l;
    .locals 8

    new-instance v7, Lcom/google/android/gms/location/l;

    iget-wide v1, p0, Lcom/google/android/gms/location/l$a;->a:J

    iget v3, p0, Lcom/google/android/gms/location/l$a;->b:I

    iget-boolean v4, p0, Lcom/google/android/gms/location/l$a;->c:Z

    iget-object v5, p0, Lcom/google/android/gms/location/l$a;->d:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/location/l$a;->e:Lcom/google/android/gms/internal/location/zzd;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/location/l;-><init>(JIZLjava/lang/String;Lcom/google/android/gms/internal/location/zzd;)V

    return-object v7
.end method
