.class public final enum Lcom/facebook/login/t;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/login/t;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/login/t;

.field public static final enum DEVICE_AUTH:Lcom/facebook/login/t;

.field public static final enum DIALOG_ONLY:Lcom/facebook/login/t;

.field public static final enum KATANA_ONLY:Lcom/facebook/login/t;

.field public static final enum NATIVE_ONLY:Lcom/facebook/login/t;

.field public static final enum NATIVE_WITH_FALLBACK:Lcom/facebook/login/t;

.field public static final enum WEB_ONLY:Lcom/facebook/login/t;


# instance fields
.field private final allowsCustomTabAuth:Z

.field private final allowsDeviceAuth:Z

.field private final allowsFacebookLiteAuth:Z

.field private final allowsGetTokenAuth:Z

.field private final allowsInstagramAppAuth:Z

.field private final allowsKatanaAuth:Z

.field private final allowsWebViewAuth:Z


# direct methods
.method static constructor <clinit>()V
    .locals 21

    new-instance v10, Lcom/facebook/login/t;

    const-string v1, "NATIVE_WITH_FALLBACK"

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x1

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/facebook/login/t;-><init>(Ljava/lang/String;IZZZZZZZ)V

    sput-object v10, Lcom/facebook/login/t;->NATIVE_WITH_FALLBACK:Lcom/facebook/login/t;

    new-instance v0, Lcom/facebook/login/t;

    const-string v12, "NATIVE_ONLY"

    const/4 v13, 0x1

    const/4 v14, 0x1

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x1

    move-object v11, v0

    invoke-direct/range {v11 .. v20}, Lcom/facebook/login/t;-><init>(Ljava/lang/String;IZZZZZZZ)V

    sput-object v0, Lcom/facebook/login/t;->NATIVE_ONLY:Lcom/facebook/login/t;

    new-instance v0, Lcom/facebook/login/t;

    const-string v2, "KATANA_ONLY"

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, Lcom/facebook/login/t;-><init>(Ljava/lang/String;IZZZZZZZ)V

    sput-object v0, Lcom/facebook/login/t;->KATANA_ONLY:Lcom/facebook/login/t;

    new-instance v0, Lcom/facebook/login/t;

    const-string v12, "WEB_ONLY"

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v11, v0

    invoke-direct/range {v11 .. v20}, Lcom/facebook/login/t;-><init>(Ljava/lang/String;IZZZZZZZ)V

    sput-object v0, Lcom/facebook/login/t;->WEB_ONLY:Lcom/facebook/login/t;

    new-instance v0, Lcom/facebook/login/t;

    const-string v2, "DIALOG_ONLY"

    const/4 v3, 0x4

    const/4 v6, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x1

    const/4 v10, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, Lcom/facebook/login/t;-><init>(Ljava/lang/String;IZZZZZZZ)V

    sput-object v0, Lcom/facebook/login/t;->DIALOG_ONLY:Lcom/facebook/login/t;

    new-instance v0, Lcom/facebook/login/t;

    const-string v12, "DEVICE_AUTH"

    const/4 v13, 0x5

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    move-object v11, v0

    invoke-direct/range {v11 .. v20}, Lcom/facebook/login/t;-><init>(Ljava/lang/String;IZZZZZZZ)V

    sput-object v0, Lcom/facebook/login/t;->DEVICE_AUTH:Lcom/facebook/login/t;

    invoke-static {}, Lcom/facebook/login/t;->b()[Lcom/facebook/login/t;

    move-result-object v0

    sput-object v0, Lcom/facebook/login/t;->$VALUES:[Lcom/facebook/login/t;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZZZZZZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZZZZZ)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lcom/facebook/login/t;->allowsGetTokenAuth:Z

    iput-boolean p4, p0, Lcom/facebook/login/t;->allowsKatanaAuth:Z

    iput-boolean p5, p0, Lcom/facebook/login/t;->allowsWebViewAuth:Z

    iput-boolean p6, p0, Lcom/facebook/login/t;->allowsDeviceAuth:Z

    iput-boolean p7, p0, Lcom/facebook/login/t;->allowsCustomTabAuth:Z

    iput-boolean p8, p0, Lcom/facebook/login/t;->allowsFacebookLiteAuth:Z

    iput-boolean p9, p0, Lcom/facebook/login/t;->allowsInstagramAppAuth:Z

    return-void
.end method

.method private static final synthetic b()[Lcom/facebook/login/t;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lcom/facebook/login/t;

    const/4 v1, 0x0

    sget-object v2, Lcom/facebook/login/t;->NATIVE_WITH_FALLBACK:Lcom/facebook/login/t;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/facebook/login/t;->NATIVE_ONLY:Lcom/facebook/login/t;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/facebook/login/t;->KATANA_ONLY:Lcom/facebook/login/t;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/facebook/login/t;->WEB_ONLY:Lcom/facebook/login/t;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/facebook/login/t;->DIALOG_ONLY:Lcom/facebook/login/t;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/login/t;->DEVICE_AUTH:Lcom/facebook/login/t;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/login/t;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/facebook/login/t;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/login/t;

    return-object p0
.end method

.method public static values()[Lcom/facebook/login/t;
    .locals 2

    sget-object v0, Lcom/facebook/login/t;->$VALUES:[Lcom/facebook/login/t;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/login/t;

    return-object v0
.end method


# virtual methods
.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/login/t;->allowsCustomTabAuth:Z

    return v0
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/login/t;->allowsDeviceAuth:Z

    return v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/login/t;->allowsGetTokenAuth:Z

    return v0
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/login/t;->allowsInstagramAppAuth:Z

    return v0
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/login/t;->allowsKatanaAuth:Z

    return v0
.end method

.method public final o()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/login/t;->allowsWebViewAuth:Z

    return v0
.end method
