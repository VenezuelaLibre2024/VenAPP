.class public final enum Lra/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lra/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lra/a$a;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final enum ABSENT:Lra/a$a;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lra/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum OBJECT:Lra/a$a;

.field public static final enum STRING:Lra/a$a;

.field private static final synthetic zza:[Lra/a$a;


# instance fields
.field private final zzb:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lra/a$a;

    const-string v1, "ABSENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lra/a$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lra/a$a;->ABSENT:Lra/a$a;

    new-instance v1, Lra/a$a;

    const-string v3, "STRING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lra/a$a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lra/a$a;->STRING:Lra/a$a;

    new-instance v3, Lra/a$a;

    const-string v5, "OBJECT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lra/a$a;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lra/a$a;->OBJECT:Lra/a$a;

    const/4 v5, 0x3

    new-array v5, v5, [Lra/a$a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lra/a$a;->zza:[Lra/a$a;

    new-instance v0, Lra/f;

    invoke-direct {v0}, Lra/f;-><init>()V

    sput-object v0, Lra/a$a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lra/a$a;->zzb:I

    return-void
.end method

.method static bridge synthetic b(Lra/a$a;)I
    .locals 0

    iget p0, p0, Lra/a$a;->zzb:I

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lra/a$a;
    .locals 1

    const-class v0, Lra/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lra/a$a;

    return-object p0
.end method

.method public static values()[Lra/a$a;
    .locals 1

    sget-object v0, Lra/a$a;->zza:[Lra/a$a;

    invoke-virtual {v0}, [Lra/a$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lra/a$a;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Lra/a$a;->zzb:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
