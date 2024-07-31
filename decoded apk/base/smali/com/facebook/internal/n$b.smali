.class public final enum Lcom/facebook/internal/n$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/internal/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/n$b$a;,
        Lcom/facebook/internal/n$b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/internal/n$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/internal/n$b;

.field public static final enum AAM:Lcom/facebook/internal/n$b;

.field public static final enum AnrReport:Lcom/facebook/internal/n$b;

.field public static final enum AppEvents:Lcom/facebook/internal/n$b;

.field public static final enum BlocklistEvents:Lcom/facebook/internal/n$b;

.field public static final enum BypassAppSwitch:Lcom/facebook/internal/n$b;

.field public static final enum ChromeCustomTabsPrefetching:Lcom/facebook/internal/n$b;

.field public static final enum CloudBridge:Lcom/facebook/internal/n$b;

.field public static final enum CodelessEvents:Lcom/facebook/internal/n$b;

.field public static final Companion:Lcom/facebook/internal/n$b$a;

.field public static final enum Core:Lcom/facebook/internal/n$b;

.field public static final enum CrashReport:Lcom/facebook/internal/n$b;

.field public static final enum CrashShield:Lcom/facebook/internal/n$b;

.field public static final enum Elora:Lcom/facebook/internal/n$b;

.field public static final enum ErrorReport:Lcom/facebook/internal/n$b;

.field public static final enum EventDeactivation:Lcom/facebook/internal/n$b;

.field public static final enum FilterRedactedEvents:Lcom/facebook/internal/n$b;

.field public static final enum FilterSensitiveParams:Lcom/facebook/internal/n$b;

.field public static final enum IapLogging:Lcom/facebook/internal/n$b;

.field public static final enum IapLoggingLib2:Lcom/facebook/internal/n$b;

.field public static final enum IgnoreAppSwitchToLoggedOut:Lcom/facebook/internal/n$b;

.field public static final enum Instrument:Lcom/facebook/internal/n$b;

.field public static final enum IntelligentIntegrity:Lcom/facebook/internal/n$b;

.field public static final enum Login:Lcom/facebook/internal/n$b;

.field public static final enum MACARuleMatching:Lcom/facebook/internal/n$b;

.field public static final enum Megatron:Lcom/facebook/internal/n$b;

.field public static final enum ModelRequest:Lcom/facebook/internal/n$b;

.field public static final enum Monitoring:Lcom/facebook/internal/n$b;

.field public static final enum OnDeviceEventProcessing:Lcom/facebook/internal/n$b;

.field public static final enum OnDevicePostInstallEventProcessing:Lcom/facebook/internal/n$b;

.field public static final enum PrivacyProtection:Lcom/facebook/internal/n$b;

.field public static final enum ProtectedMode:Lcom/facebook/internal/n$b;

.field public static final enum RestrictiveDataFiltering:Lcom/facebook/internal/n$b;

.field public static final enum ServiceUpdateCompliance:Lcom/facebook/internal/n$b;

.field public static final enum Share:Lcom/facebook/internal/n$b;

.field public static final enum SuggestedEvents:Lcom/facebook/internal/n$b;

.field public static final enum ThreadCheck:Lcom/facebook/internal/n$b;

.field public static final enum Unknown:Lcom/facebook/internal/n$b;


# instance fields
.field private final code:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/facebook/internal/n$b;

    const/4 v1, -0x1

    const-string v2, "Unknown"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->Unknown:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const-string v1, "Core"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->Core:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/4 v1, 0x2

    const/high16 v2, 0x10000

    const-string v3, "AppEvents"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->AppEvents:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/4 v1, 0x3

    const v2, 0x10100

    const-string v3, "CodelessEvents"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->CodelessEvents:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/4 v1, 0x4

    const v2, 0x10800

    const-string v3, "CloudBridge"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->CloudBridge:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/4 v1, 0x5

    const v2, 0x10200

    const-string v3, "RestrictiveDataFiltering"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->RestrictiveDataFiltering:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/4 v1, 0x6

    const v2, 0x10300

    const-string v3, "AAM"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->AAM:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/4 v1, 0x7

    const v2, 0x10400

    const-string v3, "PrivacyProtection"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->PrivacyProtection:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x8

    const v2, 0x10401

    const-string v3, "SuggestedEvents"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->SuggestedEvents:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x9

    const v2, 0x10402

    const-string v3, "IntelligentIntegrity"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->IntelligentIntegrity:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0xa

    const v2, 0x10403

    const-string v3, "ModelRequest"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->ModelRequest:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0xb

    const v2, 0x10404

    const-string v3, "ProtectedMode"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->ProtectedMode:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0xc

    const v2, 0x10405

    const-string v3, "MACARuleMatching"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->MACARuleMatching:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0xd

    const v2, 0x10406

    const-string v3, "BlocklistEvents"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->BlocklistEvents:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0xe

    const v2, 0x10407

    const-string v3, "FilterRedactedEvents"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->FilterRedactedEvents:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0xf

    const v2, 0x10408

    const-string v3, "FilterSensitiveParams"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->FilterSensitiveParams:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x10

    const v2, 0x10500

    const-string v3, "EventDeactivation"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->EventDeactivation:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x11

    const v2, 0x10600

    const-string v3, "OnDeviceEventProcessing"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->OnDeviceEventProcessing:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x12

    const v2, 0x10601

    const-string v3, "OnDevicePostInstallEventProcessing"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->OnDevicePostInstallEventProcessing:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x13

    const v2, 0x10700

    const-string v3, "IapLogging"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->IapLogging:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x14

    const v2, 0x10701

    const-string v3, "IapLoggingLib2"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->IapLoggingLib2:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x15

    const/high16 v2, 0x20000

    const-string v3, "Instrument"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->Instrument:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x16

    const v2, 0x20100

    const-string v3, "CrashReport"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->CrashReport:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x17

    const v2, 0x20101

    const-string v3, "CrashShield"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->CrashShield:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x18

    const v2, 0x20102

    const-string v3, "ThreadCheck"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->ThreadCheck:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x19

    const v2, 0x20200

    const-string v3, "ErrorReport"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->ErrorReport:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x1a

    const v2, 0x20300

    const-string v3, "AnrReport"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->AnrReport:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x1b

    const/high16 v2, 0x30000

    const-string v3, "Monitoring"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->Monitoring:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x1c

    const v2, 0x30100

    const-string v3, "ServiceUpdateCompliance"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->ServiceUpdateCompliance:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x1d

    const/high16 v2, 0x40000

    const-string v3, "Megatron"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->Megatron:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x1e

    const/high16 v2, 0x50000

    const-string v3, "Elora"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->Elora:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x1f

    const/high16 v2, 0x1000000

    const-string v3, "Login"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->Login:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x20

    const/high16 v2, 0x1010000

    const-string v3, "ChromeCustomTabsPrefetching"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->ChromeCustomTabsPrefetching:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x21

    const/high16 v2, 0x1020000

    const-string v3, "IgnoreAppSwitchToLoggedOut"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->IgnoreAppSwitchToLoggedOut:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x22

    const/high16 v2, 0x1030000

    const-string v3, "BypassAppSwitch"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->BypassAppSwitch:Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b;

    const/16 v1, 0x23

    const/high16 v2, 0x2000000

    const-string v3, "Share"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/n$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/internal/n$b;->Share:Lcom/facebook/internal/n$b;

    invoke-static {}, Lcom/facebook/internal/n$b;->b()[Lcom/facebook/internal/n$b;

    move-result-object v0

    sput-object v0, Lcom/facebook/internal/n$b;->$VALUES:[Lcom/facebook/internal/n$b;

    new-instance v0, Lcom/facebook/internal/n$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/internal/n$b$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/facebook/internal/n$b;->Companion:Lcom/facebook/internal/n$b$a;

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

    iput p3, p0, Lcom/facebook/internal/n$b;->code:I

    return-void
.end method

.method private static final synthetic b()[Lcom/facebook/internal/n$b;
    .locals 3

    const/16 v0, 0x24

    new-array v0, v0, [Lcom/facebook/internal/n$b;

    const/4 v1, 0x0

    sget-object v2, Lcom/facebook/internal/n$b;->Unknown:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/facebook/internal/n$b;->Core:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/facebook/internal/n$b;->AppEvents:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/facebook/internal/n$b;->CodelessEvents:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/facebook/internal/n$b;->CloudBridge:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/internal/n$b;->RestrictiveDataFiltering:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/internal/n$b;->AAM:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/facebook/internal/n$b;->PrivacyProtection:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/facebook/internal/n$b;->SuggestedEvents:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/facebook/internal/n$b;->IntelligentIntegrity:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/facebook/internal/n$b;->ModelRequest:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/facebook/internal/n$b;->ProtectedMode:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/facebook/internal/n$b;->MACARuleMatching:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/facebook/internal/n$b;->BlocklistEvents:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lcom/facebook/internal/n$b;->FilterRedactedEvents:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lcom/facebook/internal/n$b;->FilterSensitiveParams:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lcom/facebook/internal/n$b;->EventDeactivation:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lcom/facebook/internal/n$b;->OnDeviceEventProcessing:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x12

    sget-object v2, Lcom/facebook/internal/n$b;->OnDevicePostInstallEventProcessing:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x13

    sget-object v2, Lcom/facebook/internal/n$b;->IapLogging:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x14

    sget-object v2, Lcom/facebook/internal/n$b;->IapLoggingLib2:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x15

    sget-object v2, Lcom/facebook/internal/n$b;->Instrument:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x16

    sget-object v2, Lcom/facebook/internal/n$b;->CrashReport:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x17

    sget-object v2, Lcom/facebook/internal/n$b;->CrashShield:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x18

    sget-object v2, Lcom/facebook/internal/n$b;->ThreadCheck:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x19

    sget-object v2, Lcom/facebook/internal/n$b;->ErrorReport:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x1a

    sget-object v2, Lcom/facebook/internal/n$b;->AnrReport:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x1b

    sget-object v2, Lcom/facebook/internal/n$b;->Monitoring:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x1c

    sget-object v2, Lcom/facebook/internal/n$b;->ServiceUpdateCompliance:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x1d

    sget-object v2, Lcom/facebook/internal/n$b;->Megatron:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x1e

    sget-object v2, Lcom/facebook/internal/n$b;->Elora:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x1f

    sget-object v2, Lcom/facebook/internal/n$b;->Login:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x20

    sget-object v2, Lcom/facebook/internal/n$b;->ChromeCustomTabsPrefetching:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x21

    sget-object v2, Lcom/facebook/internal/n$b;->IgnoreAppSwitchToLoggedOut:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x22

    sget-object v2, Lcom/facebook/internal/n$b;->BypassAppSwitch:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    const/16 v1, 0x23

    sget-object v2, Lcom/facebook/internal/n$b;->Share:Lcom/facebook/internal/n$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static final synthetic h(Lcom/facebook/internal/n$b;)I
    .locals 0

    iget p0, p0, Lcom/facebook/internal/n$b;->code:I

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/internal/n$b;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/facebook/internal/n$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/internal/n$b;

    return-object p0
.end method

.method public static values()[Lcom/facebook/internal/n$b;
    .locals 2

    sget-object v0, Lcom/facebook/internal/n$b;->$VALUES:[Lcom/facebook/internal/n$b;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/internal/n$b;

    return-object v0
.end method


# virtual methods
.method public final i()Lcom/facebook/internal/n$b;
    .locals 3

    iget v0, p0, Lcom/facebook/internal/n$b;->code:I

    and-int/lit16 v1, v0, 0xff

    if-lez v1, :cond_0

    sget-object v1, Lcom/facebook/internal/n$b;->Companion:Lcom/facebook/internal/n$b$a;

    and-int/lit16 v0, v0, -0x100

    :goto_0
    invoke-virtual {v1, v0}, Lcom/facebook/internal/n$b$a;->a(I)Lcom/facebook/internal/n$b;

    move-result-object v0

    goto :goto_2

    :cond_0
    const v1, 0xff00

    and-int/2addr v1, v0

    if-lez v1, :cond_1

    sget-object v1, Lcom/facebook/internal/n$b;->Companion:Lcom/facebook/internal/n$b$a;

    const/high16 v2, -0x10000

    :goto_1
    and-int/2addr v0, v2

    goto :goto_0

    :cond_1
    const/high16 v1, 0xff0000

    and-int/2addr v1, v0

    if-lez v1, :cond_2

    sget-object v1, Lcom/facebook/internal/n$b;->Companion:Lcom/facebook/internal/n$b$a;

    const/high16 v2, -0x1000000

    goto :goto_1

    :cond_2
    sget-object v0, Lcom/facebook/internal/n$b;->Companion:Lcom/facebook/internal/n$b$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/internal/n$b$a;->a(I)Lcom/facebook/internal/n$b;

    move-result-object v0

    :goto_2
    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    const-string v0, "FBSDKFeature"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/facebook/internal/n$b$b;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const-string v0, "unknown"

    goto/16 :goto_0

    :pswitch_0
    const-string v0, "ShareKit"

    goto/16 :goto_0

    :pswitch_1
    const-string v0, "BypassAppSwitch"

    goto/16 :goto_0

    :pswitch_2
    const-string v0, "IgnoreAppSwitchToLoggedOut"

    goto/16 :goto_0

    :pswitch_3
    const-string v0, "ChromeCustomTabsPrefetching"

    goto/16 :goto_0

    :pswitch_4
    const-string v0, "LoginKit"

    goto/16 :goto_0

    :pswitch_5
    const-string v0, "ServiceUpdateCompliance"

    goto/16 :goto_0

    :pswitch_6
    const-string v0, "Elora"

    goto/16 :goto_0

    :pswitch_7
    const-string v0, "Megatron"

    goto/16 :goto_0

    :pswitch_8
    const-string v0, "Monitoring"

    goto/16 :goto_0

    :pswitch_9
    const-string v0, "IAPLoggingLib2"

    goto :goto_0

    :pswitch_a
    const-string v0, "IAPLogging"

    goto :goto_0

    :pswitch_b
    const-string v0, "OnDevicePostInstallEventProcessing"

    goto :goto_0

    :pswitch_c
    const-string v0, "OnDeviceEventProcessing"

    goto :goto_0

    :pswitch_d
    const-string v0, "EventDeactivation"

    goto :goto_0

    :pswitch_e
    const-string v0, "ModelRequest"

    goto :goto_0

    :pswitch_f
    const-string v0, "FilterSensitiveParams"

    goto :goto_0

    :pswitch_10
    const-string v0, "FilterRedactedEvents"

    goto :goto_0

    :pswitch_11
    const-string v0, "BlocklistEvents"

    goto :goto_0

    :pswitch_12
    const-string v0, "MACARuleMatching"

    goto :goto_0

    :pswitch_13
    const-string v0, "ProtectedMode"

    goto :goto_0

    :pswitch_14
    const-string v0, "IntelligentIntegrity"

    goto :goto_0

    :pswitch_15
    const-string v0, "SuggestedEvents"

    goto :goto_0

    :pswitch_16
    const-string v0, "PrivacyProtection"

    goto :goto_0

    :pswitch_17
    const-string v0, "AppEventsCloudbridge"

    goto :goto_0

    :pswitch_18
    const-string v0, "AAM"

    goto :goto_0

    :pswitch_19
    const-string v0, "AnrReport"

    goto :goto_0

    :pswitch_1a
    const-string v0, "ErrorReport"

    goto :goto_0

    :pswitch_1b
    const-string v0, "ThreadCheck"

    goto :goto_0

    :pswitch_1c
    const-string v0, "CrashShield"

    goto :goto_0

    :pswitch_1d
    const-string v0, "CrashReport"

    goto :goto_0

    :pswitch_1e
    const-string v0, "Instrument"

    goto :goto_0

    :pswitch_1f
    const-string v0, "RestrictiveDataFiltering"

    goto :goto_0

    :pswitch_20
    const-string v0, "CodelessEvents"

    goto :goto_0

    :pswitch_21
    const-string v0, "AppEvents"

    goto :goto_0

    :pswitch_22
    const-string v0, "CoreKit"

    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
