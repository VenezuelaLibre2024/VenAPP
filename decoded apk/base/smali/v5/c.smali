.class public final enum Lv5/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lv5/c;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lik/a;

.field private static final synthetic $VALUES:[Lv5/c;

.field public static final enum Authorized:Lv5/c;

.field public static final enum Denied:Lv5/c;

.field public static final enum Limited:Lv5/c;

.field public static final enum NotDetermined:Lv5/c;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lv5/c;

    const-string v1, "NotDetermined"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lv5/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lv5/c;->NotDetermined:Lv5/c;

    new-instance v0, Lv5/c;

    const-string v1, "Denied"

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lv5/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lv5/c;->Denied:Lv5/c;

    new-instance v0, Lv5/c;

    const-string v1, "Authorized"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v3, v2}, Lv5/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lv5/c;->Authorized:Lv5/c;

    new-instance v0, Lv5/c;

    const-string v1, "Limited"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lv5/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lv5/c;->Limited:Lv5/c;

    invoke-static {}, Lv5/c;->b()[Lv5/c;

    move-result-object v0

    sput-object v0, Lv5/c;->$VALUES:[Lv5/c;

    invoke-static {v0}, Lik/b;->a([Ljava/lang/Enum;)Lik/a;

    move-result-object v0

    sput-object v0, Lv5/c;->$ENTRIES:Lik/a;

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

    iput p3, p0, Lv5/c;->value:I

    return-void
.end method

.method private static final synthetic b()[Lv5/c;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lv5/c;

    const/4 v1, 0x0

    sget-object v2, Lv5/c;->NotDetermined:Lv5/c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lv5/c;->Denied:Lv5/c;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lv5/c;->Authorized:Lv5/c;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lv5/c;->Limited:Lv5/c;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lv5/c;
    .locals 1

    const-class v0, Lv5/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lv5/c;

    return-object p0
.end method

.method public static values()[Lv5/c;
    .locals 1

    sget-object v0, Lv5/c;->$VALUES:[Lv5/c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv5/c;

    return-object v0
.end method


# virtual methods
.method public final h()I
    .locals 1

    iget v0, p0, Lv5/c;->value:I

    return v0
.end method
