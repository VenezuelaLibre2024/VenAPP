.class public final enum Lvk/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvk/j;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lik/a;

.field private static final synthetic $VALUES:[Lvk/j;

.field public static final enum INTERNAL:Lvk/j;

.field public static final enum PRIVATE:Lvk/j;

.field public static final enum PROTECTED:Lvk/j;

.field public static final enum PUBLIC:Lvk/j;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lvk/j;

    const-string v1, "PUBLIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lvk/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvk/j;->PUBLIC:Lvk/j;

    new-instance v0, Lvk/j;

    const-string v1, "PROTECTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lvk/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvk/j;->PROTECTED:Lvk/j;

    new-instance v0, Lvk/j;

    const-string v1, "INTERNAL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lvk/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvk/j;->INTERNAL:Lvk/j;

    new-instance v0, Lvk/j;

    const-string v1, "PRIVATE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lvk/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvk/j;->PRIVATE:Lvk/j;

    invoke-static {}, Lvk/j;->b()[Lvk/j;

    move-result-object v0

    sput-object v0, Lvk/j;->$VALUES:[Lvk/j;

    invoke-static {v0}, Lik/b;->a([Ljava/lang/Enum;)Lik/a;

    move-result-object v0

    sput-object v0, Lvk/j;->$ENTRIES:Lik/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic b()[Lvk/j;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lvk/j;

    const/4 v1, 0x0

    sget-object v2, Lvk/j;->PUBLIC:Lvk/j;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lvk/j;->PROTECTED:Lvk/j;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lvk/j;->INTERNAL:Lvk/j;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lvk/j;->PRIVATE:Lvk/j;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lvk/j;
    .locals 1

    const-class v0, Lvk/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvk/j;

    return-object p0
.end method

.method public static values()[Lvk/j;
    .locals 1

    sget-object v0, Lvk/j;->$VALUES:[Lvk/j;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvk/j;

    return-object v0
.end method
