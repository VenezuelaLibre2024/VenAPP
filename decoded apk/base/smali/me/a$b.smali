.class public final enum Lme/a$b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lmd/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lme/a$b;",
        ">;",
        "Lmd/c;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lme/a$b;

.field public static final enum MESSAGE_DELIVERED:Lme/a$b;

.field public static final enum MESSAGE_OPEN:Lme/a$b;

.field public static final enum UNKNOWN_EVENT:Lme/a$b;


# instance fields
.field private final number_:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lme/a$b;

    const-string v1, "UNKNOWN_EVENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lme/a$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lme/a$b;->UNKNOWN_EVENT:Lme/a$b;

    new-instance v1, Lme/a$b;

    const-string v3, "MESSAGE_DELIVERED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lme/a$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lme/a$b;->MESSAGE_DELIVERED:Lme/a$b;

    new-instance v3, Lme/a$b;

    const-string v5, "MESSAGE_OPEN"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lme/a$b;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lme/a$b;->MESSAGE_OPEN:Lme/a$b;

    const/4 v5, 0x3

    new-array v5, v5, [Lme/a$b;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lme/a$b;->$VALUES:[Lme/a$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lme/a$b;->number_:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lme/a$b;
    .locals 1

    const-class v0, Lme/a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lme/a$b;

    return-object p0
.end method

.method public static values()[Lme/a$b;
    .locals 1

    sget-object v0, Lme/a$b;->$VALUES:[Lme/a$b;

    invoke-virtual {v0}, [Lme/a$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lme/a$b;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lme/a$b;->number_:I

    return v0
.end method
