.class public final Lcom/google/android/gms/measurement/internal/na;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/measurement/internal/na;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/measurement/internal/qa;

    invoke-direct {v0}, Lcom/google/android/gms/measurement/internal/qa;-><init>()V

    sput-object v0, Lcom/google/android/gms/measurement/internal/na;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;JI)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/na;->a:Ljava/lang/String;

    iput-wide p2, p0, Lcom/google/android/gms/measurement/internal/na;->b:J

    iput p4, p0, Lcom/google/android/gms/measurement/internal/na;->c:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/na;->a:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v2, v0, v1}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x2

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/na;->b:J

    invoke-static {p1, v0, v1, v2}, Lea/c;->z(Landroid/os/Parcel;IJ)V

    const/4 v0, 0x3

    iget v1, p0, Lcom/google/android/gms/measurement/internal/na;->c:I

    invoke-static {p1, v0, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
