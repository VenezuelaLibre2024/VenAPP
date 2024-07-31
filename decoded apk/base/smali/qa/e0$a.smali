.class public final enum Lqa/e0$a;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqa/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqa/e0$a;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lqa/e0$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum NOT_SUPPORTED:Lqa/e0$a;

.field public static final enum PRESENT:Lqa/e0$a;

.field public static final enum SUPPORTED:Lqa/e0$a;

.field private static final synthetic zza:[Lqa/e0$a;


# instance fields
.field private final zzb:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lqa/e0$a;

    const-string v1, "PRESENT"

    const/4 v2, 0x0

    const-string v3, "present"

    invoke-direct {v0, v1, v2, v3}, Lqa/e0$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lqa/e0$a;->PRESENT:Lqa/e0$a;

    new-instance v1, Lqa/e0$a;

    const-string v3, "SUPPORTED"

    const/4 v4, 0x1

    const-string v5, "supported"

    invoke-direct {v1, v3, v4, v5}, Lqa/e0$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lqa/e0$a;->SUPPORTED:Lqa/e0$a;

    new-instance v3, Lqa/e0$a;

    const-string v5, "NOT_SUPPORTED"

    const/4 v6, 0x2

    const-string v7, "not-supported"

    invoke-direct {v3, v5, v6, v7}, Lqa/e0$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lqa/e0$a;->NOT_SUPPORTED:Lqa/e0$a;

    const/4 v5, 0x3

    new-array v5, v5, [Lqa/e0$a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lqa/e0$a;->zza:[Lqa/e0$a;

    new-instance v0, Lqa/c1;

    invoke-direct {v0}, Lqa/c1;-><init>()V

    sput-object v0, Lqa/e0$a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lqa/e0$a;->zzb:Ljava/lang/String;

    return-void
.end method

.method public static b(Ljava/lang/String;)Lqa/e0$a;
    .locals 5

    invoke-static {}, Lqa/e0$a;->values()[Lqa/e0$a;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-object v4, v3, Lqa/e0$a;->zzb:Ljava/lang/String;

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lqa/e0$b;

    invoke-direct {v0, p0}, Lqa/e0$b;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lqa/e0$a;
    .locals 1

    const-class v0, Lqa/e0$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqa/e0$a;

    return-object p0
.end method

.method public static values()[Lqa/e0$a;
    .locals 1

    sget-object v0, Lqa/e0$a;->zza:[Lqa/e0$a;

    invoke-virtual {v0}, [Lqa/e0$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqa/e0$a;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqa/e0$a;->zzb:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Lqa/e0$a;->zzb:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
