.class public final Lb4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/f;


# static fields
.field private static final b:Lb4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb4/c;

    invoke-direct {v0}, Lb4/c;-><init>()V

    sput-object v0, Lb4/c;->b:Lb4/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lb4/c;
    .locals 1

    sget-object v0, Lb4/c;->b:Lb4/c;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/security/MessageDigest;)V
    .locals 0

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmptySignature"

    return-object v0
.end method
